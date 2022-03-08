public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){ //bu new'lerken çalışıyordu. Bu yapı construction yapıdır.
        this.logger = logger;
    }
    public void add(){
        System.out.println("Customer is added.");
        DatabaseLogger logger = new DatabaseLogger();
        this.logger.log("Log message.");
    }

}
