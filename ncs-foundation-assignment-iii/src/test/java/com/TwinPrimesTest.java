package com;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.stackroute.unittesting.TwinPrimes;

public class TwinPrimesTest {

    TwinPrimes tp;
    @BeforeEach
    public void ForeachExecution(){
        tp = new TwinPrimes();
    }
    
    @Test
    public void Lessthan100(){
        String expRes="{(3,5),(5,7),(11,13),(17,19),(29,31),(41,43),(59,61),(71,73)}";
        String actRes=tp.findTwinPrimes(100);
        assertEquals(expRes,actRes);
    }

    @Test
    public void Greaterthan100(){ //till 200
        String expRes="{(3,5),(5,7),(11,13),(17,19),(29,31),(41,43),(59,61),(71,73),(101,103),(107,109),(137,139),(149,151),(179,181),(191,193),(197,199)}";
        String actRes=tp.findTwinPrimes(200);
        assertEquals(expRes,actRes);
    }

    @Test
    public void TwinPrimeNotNull(){ //till 200
        assertNotNull(tp.findTwinPrimes(200));
    }

    @Test
    public void IsPrime(){
        boolean expRes=true;
        boolean actRes=tp.isPrime(19);
        assertEquals(expRes,actRes);
    }

    @Test
    public void IsNonPrime(){
        boolean expRes=false;
        boolean actRes=tp.isPrime(39);
        assertEquals(expRes,actRes);
    }

    @Test
    public void IsPrimeNotNull(){
        assertNotNull(tp.isPrime(20));
    }

}
