package com.order6tyfix.TCIDVerifier.api;

import org.springframework.stereotype.Service;

@Service
public class ApiService {

    public static int verify(String tc) {
        int code = 200;
        int total_odd = 0;
        int total_even = 0;
        int index10 = Character.getNumericValue(tc.charAt(9));
        int index11 = Character.getNumericValue(tc.charAt(10));

        try {
            if (tc.length() != 11) {
                code = 422;
            } else {
                if (tc.charAt(0) == '0') {
                    code = 422;
                }
                for(int i=0;i<9;i++){
                    int digit = Character.getNumericValue(tc.charAt(i));
                    if (i % 2 == 0) {
                        total_odd += digit;
                    } else {
                        total_even += digit;
                    }
                }

                if ((total_odd * 7 - total_even) % 10 != index10 || (total_odd + total_even + index10) % 10 != index11) {
                    code = 422;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            code = 422;
        }

        return code;
    }





}
