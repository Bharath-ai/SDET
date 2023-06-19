package week6.day1;

//https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=true

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;
        int count=0;

     
        if (n < 6) {
            count += 6 - n;
        }


        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if ("!@#$%^&*()-+".contains(String.valueOf(c))) {
                hasSpecial = true;
            }
        }

    
        int criteriaCount = 0;
        if (!hasDigit) {
            criteriaCount++;
        }
        if (!hasLower) {
            criteriaCount++;
        }
        if (!hasUpper) {
            criteriaCount++;
        }
        if (!hasSpecial) {
            criteriaCount++;
        }

       
        count = Math.max(count, criteriaCount);

        return count;
        
    }
}
