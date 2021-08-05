package com.example.smscode.AdditionalClasses;

public class AutoBrandClass
{
    private String brandName;
    private String officialSite;
    private int brandLogo;

    public AutoBrandClass(String brandName, String oficialSite, int brandLogo)
    {
        this.brandName = brandName;
        this.brandLogo = brandLogo;
        this.officialSite = oficialSite;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getBrandLogo() {
        return brandLogo;
    }

    public String getofficialSite() {
        return officialSite;
    }



}

