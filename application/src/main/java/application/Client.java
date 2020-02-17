package application;
import java.io.*;
import java.util.*;
import java.lang.*;
public class Client
{
    public static void main(String args[]) throws IOException
    {
        Interest i = new Interest();
        Construction c = new Construction();
        System.out.println("-----INTEREST-----");
        i.calc_interest();
        System.out.println("-----CONSTRUCTION ESTIMATION-----");
        c.estimation();
    }

}
