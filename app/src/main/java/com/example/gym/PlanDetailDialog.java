package com.example.gym;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import static com.example.gym.TrainingActivity.TRAINING_KEY;

public class PlanDetailDialog extends DialogFragment {

    public interface PassPlanInterface {
        void getPlan(Plan plan);
    }

    private PassPlanInterface passPlanInterface;


    private Button btnDismiss, btnAdd;
    private TextView txtName;
    private EditText editTextMinutes;
    private Spinner spinnerDay;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {


        View view = getActivity().getLayoutInflater().inflate(R.layout.dialog_plan_details, null);
        initViews(view);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity()).setView(view).setTitle("Enter Details");

        Bundle bundle = getArguments();
        if (null != bundle) {
            final Training training = bundle.getParcelable(TRAINING_KEY);
            if (null != training) {
                txtName.setText(training.getName());
                btnDismiss.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dismiss();
                    }
                });
                btnAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String day = spinnerDay.getSelectedItem().toString();
                        int minutes = Integer.parseInt(editTextMinutes.getText().toString());
                        Plan plan = new Plan(training, minutes, day, false);

                        try {
                            passPlanInterface = (PassPlanInterface) getActivity();
                            passPlanInterface.getPlan(plan);
                            dismiss();
                        } catch (ClassCastException e) {
                            e.printStackTrace();
                            dismiss();
                        }

                    }
                });
            }

        }
        return builder.create();
    }

    private void initViews(View view) {
        btnAdd = view.findViewById(R.id.btnAdd);
        btnDismiss = view.findViewById(R.id.btnDismiss);
        txtName = view.findViewById(R.id.txtName);
        editTextMinutes = view.findViewById(R.id.edtTxtMinutes);
        spinnerDay = view.findViewById(R.id.spinnerDays);


    }
}
