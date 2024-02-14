/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment3;

import java.util.*;

/**
 *
 * @author garma
 */
public class PrimeNumbers implements Iterable<Integer>
{
    private List<Integer> primes = new ArrayList<Integer>();

    public void computePrimes(int n)
    {
        int count = 1; // number tested for primeness
        int number = 2; // number to be checked for primeness
        boolean isPrime; // Is this prime?

        while (count <= n)
        {
            isPrime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++)
            {
                if (number % divisor == 0)
                {
                    isPrime = false;
                    break; // for loop
                }
            }

            if (isPrime && (number % 10 != 9)) // FAULT
            {
                primes.add(number);
                count++;
            }

            number++;
        }
    }

    @Override public Iterator<Integer> iterator()
    {
        return primes.iterator();
    }

    @Override public String toString()
    {
        return primes.toString();
    }
}

