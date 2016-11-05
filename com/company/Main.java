package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int prisonersCount = 64404787;
        int sweetsCount = 990499813;
        int firstPrisonerId = 50168775;
        int prisonerToWarn = 0;

        prisonerToWarn = firstPrisonerId + sweetsCount - 1;

        if(prisonerToWarn > prisonersCount) {
            prisonerToWarn = prisonerToWarn % prisonersCount;
        }
        System.out.println(prisonerToWarn);
    }
}




