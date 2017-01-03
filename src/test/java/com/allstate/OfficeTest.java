package com.allstate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 03/01/17.
 */
public class OfficeTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void createOffice_isInitialized(){
        Office office = new Office("Belfast", "Northern Ireland",10);
        assertEquals("Belfast", office.getName());
        assertEquals("Northern Ireland", office.getLocation());
        assertEquals(10, office.getNumberOfEmployees());
    }

    @Test
    public void createOfficeList(){
        List<Office> officeList = new ArrayList<Office>();
        Office office1 = new Office("ASPL", "BLR", 8);
        officeList.add(office1);

        Office office2 = new Office("SPL", "PUNE", 645);
        officeList.add(office2);

        Office office3 = new Office("APL", "Chennai", 500);
        officeList.add(office3);

        Office office4 = new Office("ASL", "Belfast", 6);
        officeList.add(office4);

        Office office5 = new Office("ASP", "PUNE", 75);
        officeList.add(office5);

        assertEquals(5, officeList.size());

        Company company = new Company(officeList);
        assertEquals(2, company.findLocation("PUNE").size());
    }

    @Test
    public void createOfficeListOfLessThan10Employees(){
        List<Office> officeList = new ArrayList<Office>();
        Office office1 = new Office("ASPL", "BLR", 8);
        officeList.add(office1);

        Office office2 = new Office("SPL", "PUNE", 645);
        officeList.add(office2);

        Office office3 = new Office("APL", "Chennai", 500);
        officeList.add(office3);

        Office office4 = new Office("ASL", "Belfast", 6);
        officeList.add(office4);

        Office office5 = new Office("ASP", "PUNE", 75);
        officeList.add(office5);

        assertEquals(5, officeList.size());

        Company company = new Company(officeList);
        assertEquals(2, company.getLessThan10Employees().size());
    }

    @Test
    public void createOfficeListOfMoreThan100Employees(){
        List<Office> officeList = new ArrayList<Office>();
        Office office1 = new Office("ASPL", "BLR", 8);
        officeList.add(office1);

        Office office2 = new Office("SPL", "PUNE", 645);
        officeList.add(office2);

        Office office3 = new Office("APL", "Chennai", 500);
        officeList.add(office3);

        Office office4 = new Office("ASL", "Belfast", 6);
        officeList.add(office4);

        Office office5 = new Office("ASP", "PUNE", 75);
        officeList.add(office5);

        assertEquals(5, officeList.size());

        Company company = new Company(officeList);
        assertEquals(2, company.getMoreThan100Employees().size());
    }

    @Test
    public void createOfficeListOfNetherLand(){
        List<Office> officeList = new ArrayList<Office>();
        Office office1 = new Office("NetherLand", "BLR", 8);
        officeList.add(office1);

        Office office2 = new Office("America", "Newyork", 645);
        officeList.add(office2);

        Office office3 = new Office("NetherLand", "Bel", 500);
        officeList.add(office3);

        Office office4 = new Office("NetherLand", "Belfast", 6);
        officeList.add(office4);

        Office office5 = new Office("India", "PUNE", 75);
        officeList.add(office5);

        assertEquals(5, officeList.size());

        Company company = new Company(officeList);
        assertEquals(3, company.getListOfNetherLand().size());
    }

    @Test
    public void createOfficeListOfWithNameAToK(){
        List<Office> officeList = new ArrayList<Office>();
        Office office1 = new Office("NetherLand", "BLR", 8);
        officeList.add(office1);

        Office office2 = new Office("America", "Newyork", 645);
        officeList.add(office2);

        Office office3 = new Office("NetherLand", "Bel", 500);
        officeList.add(office3);

        Office office4 = new Office("NetherLand", "Belfast", 6);
        officeList.add(office4);

        Office office5 = new Office("India", "PUNE", 75);
        officeList.add(office5);

        assertEquals(5, officeList.size());

        Company company = new Company(officeList);
        assertEquals(2, company.getListOfNameFromAToK().size());
    }

    @Test
    public void createOfficeListStartWithVowelOrMoreThan15Employees(){
        List<Office> officeList = new ArrayList<Office>();
        Office office1 = new Office("NetherLand", "BLR", 8);
        officeList.add(office1);

        Office office2 = new Office("America", "Newyork", 645);
        officeList.add(office2);

        Office office3 = new Office("NetherLand", "Bel", 500);
        officeList.add(office3);

        Office office4 = new Office("NetherLand", "Belfast", 6);
        officeList.add(office4);

        Office office5 = new Office("India", "PUNE", 75);
        officeList.add(office5);

        assertEquals(5, officeList.size());

        Company company = new Company(officeList);
        assertEquals(3, company.getListOfNameStartWithVowelOrMoreThan15Employees().size());
    }
}