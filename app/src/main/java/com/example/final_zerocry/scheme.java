package com.example.final_zerocry;

public class scheme
{
    String mHeader,mDescription;
    int mImage;
    String murls;
    public scheme(String a,String b,int p,String u)
    {
        mHeader=a;
        mDescription=b;
        mImage=p;

    }
    public String getName()
    {
        return mHeader;
    }
    public String getDescription(){
        return mDescription;
    }
    public int getImage(){
        return mImage;
    }
    public String getUrl(){return murls;}

}