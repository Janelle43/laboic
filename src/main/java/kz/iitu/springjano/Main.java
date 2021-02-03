package kz.iitu.springjano;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//       BankService bankService =  context.getBean("userBean", BankService.class);
//       Bank bank = new Bank(bankService);
        Bank bank = context.getBean("bankBean", Bank.class);
       bank.infoBank();
       context.close();

        ArrayList<User> accounts = new ArrayList<>();
        Scanner in = new Scanner(System.in);


        User user = new User();
        System.out.println(user.passw.put(12344,6789));
        user.checkAcc();
        System.out.println("Выберите действие: ");
        System.out.println("1.Chech Balance");
        System.out.println("2.WithDraw");
        System.out.println("3.TopUp");
        System.out.println("4. Exit");
        int a = in.nextInt();
        switch (a){
            case 1:
                user.checkBalance();
                break;
            case 2:
                user.withDraw();
                break;

            case 3:
                user.topUp();
                break;

            case 4:
                System.out.println("Goodbye!!");
                System.exit(0);

        }
    }
    }


