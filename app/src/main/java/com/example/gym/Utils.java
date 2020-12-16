package com.example.gym;

import java.util.ArrayList;

public class Utils {
    private static ArrayList<Training> trainings;
    private static ArrayList<Plan> plans;


    public static void initTrainings(){
        if(null == trainings){
            trainings = new ArrayList<>();

        }
        Training pushUp = new Training(1,"Push Up","For chest strength",
                "The pushup may just be the perfect exercise that builds both upper-body and core strength. Done properly, it is a compound exercise that uses muscles in the chest, shoulders, triceps, back, abs, and even the legs.\n" +
                        "\n","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/1076/articles/2016/10/woman-pushup-1522242407.jpg");
        trainings.add(pushUp);

        Training pullUps = new Training(2,"Pull Up","For upper body strength",
                "The pushup may just be the perfect exercise that builds both upper-body and core strength. Done properly, it is a compound exercise that uses muscles in the chest, shoulders, triceps, back, abs, and even the legs.\n" +
                        "\n","https://onnitacademy.imgix.net/2016/02/pullups.png");
        trainings.add(pullUps);

        Training squats = new Training(3,"Squats","For lower body",
                "The pushup may just be the perfect exercise that builds both upper-body and core strength. Done properly, it is a compound exercise that uses muscles in the chest, shoulders, triceps, back, abs, and even the legs.\n" +
                        "\n","https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/anna-victoria-squat-1548705288.jpg");
        trainings.add(squats);

        Training planks = new Training(4,"Planks","For core strength",
                "Bodyweight exercises are gaining ground in the fitness world due to the practicality and simplicity of getting in shape using your own body weight. Planks are one form of bodyweight exercises that will never go out of fashion.\n" +
                        "\n","https://pleijsalon.com/wp-content/uploads/2019/10/best-ab-exercises-columbus-fitness-weight-loss-planks.jpg");
        trainings.add(planks);

        Training legPress = new Training(5,"Leg Press","For thighs strength",
                "The leg press is a compound weight training exercise in which the individual pushes a weight or resistance away from them using their legs. The term leg press machine refers to the apparatus used to perform this exercise.\n" +
                        "\n","https://www.fitnessfactoryoutlet.com/images/products/14392.png");
        trainings.add(legPress);


    }

    public static ArrayList<Training> getTrainings() {
        return trainings;
    }
    public static boolean addPlan(Plan plan){
        if (null == plans){
            plans = new ArrayList<>();
        }
        return plans.add(plan);

    }

    public static ArrayList<Plan> getPlans() {
        return plans;
    }

    public static boolean removePlan(Plan plan){
        return plans.remove(plan);

    }

}
