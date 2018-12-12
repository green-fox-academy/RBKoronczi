package com.greenfox.bankofsimba.Model;

import java.util.ArrayList;

public class Bank {
  private ArrayList<BankAccount> bank;

  public Bank() {
    bank = new ArrayList<>();
    fillBank();
  }

  public ArrayList<BankAccount> getBankAccounts() {
    return bank;
  }

  public void addAccount(BankAccount account) {
    bank.add(account);
  }

  public void addMoney(int index){
    bank.get(index).addMoney();
  }

  private void fillBank() {
    Animal simba = new Animal("Simba", "lion", true, true);
    Animal nala = new Animal("Nala", "lion", false, true);
    Animal timon = new Animal("Timon", "meerkat", false, true);
    Animal pumba = new Animal("Pumba", "warthog", false, true);
    Animal scar = new Animal("Scar", "lion", false, false);
    Animal sarabi = new Animal("Sarabi", "lion", false, true);
    Animal zazu = new Animal("Zazu", "red-billed hornbill", false, true);
    Animal rafiki = new Animal("Rafiki", "mandrill", false, true);
    Animal shenzi = new Animal("Shenzi", "spotted hyena", false, false);
    Animal banzai = new Animal("Banzai", "spotted hyena", false, false);
    Animal ed = new Animal("Ed", "spotted hyena", false, false);
    bank.add(new BankAccount(simba, 2000));
    bank.add(new BankAccount(nala, 1000));
    bank.add(new BankAccount(timon, 5));
    bank.add(new BankAccount(pumba, 10));
    bank.add(new BankAccount(scar, 100));
    bank.add(new BankAccount(sarabi, 500));
    bank.add(new BankAccount(zazu, 300));
    bank.add(new BankAccount(rafiki, 250));
    bank.add(new BankAccount(shenzi, 1));
    bank.add(new BankAccount(banzai, 2));
    bank.add(new BankAccount(ed, 0));
  }
}
