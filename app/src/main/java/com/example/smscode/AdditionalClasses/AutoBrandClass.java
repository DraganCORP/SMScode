package com.example.smscode.AdditionalClasses;

public class AutoBrandClass
{
    private String brandName;
    public String idnumber;
    private int brandLogo;

    public AutoBrandClass(String brandName, String idnumber, int brandLogo)
    {
        this.brandName = brandName;
        this.brandLogo = brandLogo;
        this.idnumber = idnumber;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getBrandLogo() {
        return brandLogo;
    }

    public String getIdnumber() {
        return idnumber;
    }



}

