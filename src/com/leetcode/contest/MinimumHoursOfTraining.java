package com.leetcode.contest;

public class MinimumHoursOfTraining {
    public static void main(String[] args) {
        MinimumHoursOfTraining m = new MinimumHoursOfTraining();
        int initialEnergy = 2, initialExperience = 4;
        int[] energy = {1}, experience = {3};

        System.out.println(m.minNumberOfHours(initialEnergy, initialExperience, energy, experience));
    }

    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int maxEnergy = initialEnergy;
        for(int a: energy)
        {
            maxEnergy -=a;
        }
        if(maxEnergy<1)
        {
            maxEnergy = maxEnergy*(-1)+1;
        }
        else{
            maxEnergy = 0;
        }
        int maxExperience = 0;

        int localSum = initialExperience;
        for(int i = 0;i<experience.length;i++)
        {
            if(experience[i]>= (localSum))
            {
                maxExperience = Math.max(maxExperience, (experience[i]+1 - (localSum)));
            }
            localSum +=experience[i];
        }

        return maxEnergy + maxExperience;
    }
}
