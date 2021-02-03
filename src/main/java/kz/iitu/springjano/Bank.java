package kz.iitu.springjano;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Bank {
    private BankService bankService;
//ioc
    public Bank(BankService bankService){
        this.bankService = bankService;
    }
 public void infoBank(){
     System.out.println("Information: " + bankService.checkAcc());
 }



}
