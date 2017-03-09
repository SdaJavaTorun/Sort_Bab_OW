package com.tab.algorytm_potegowanie;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] tab = {2,3,6,4,9,7,0,1,5,17};

        Arrays.sort(tab);

        for(int i=0; i<tab.length-1; i++) {

            for(int j=0; j<tab.length-1; j++) {

                if(tab[j]>tab[j+1]) {

                    int tmp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1]= tmp;

                }
            }
        }
        for (int k=0; k<tab.length; k++) {
            System.out.println(tab[k]+" ");
        }

    }

}
