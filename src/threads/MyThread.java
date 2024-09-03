package threads;

public class MyThread extends Thread {
    Bank bank = new Bank();

    public MyThread(Bank bank) {
        this.bank = bank;
        System.out.println(this.bank);
    }

    @Override
    public void run() {
        try {
            syncExample();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void syncExample() throws Exception {
        Thread.sleep(10);
        bank.setMoney(bank.getMoney() - 600);
    }

    public void syncExample2() throws Exception {
        synchronized (bank) {
//            if (bank.money - 600 < 1) throw new Exception("Can't get to negative");
//            Thread.sleep(10);
//            bank.money = bank.money - 600;
//            System.out.println("Waited with " + bank.money + " frw");
        }
    }
}
