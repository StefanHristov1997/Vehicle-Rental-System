package messages.customer;

public enum MessagesToCustomer {
    ;
    public final static String HELLO_CUSTOMER = "Hello Customer!";
    public final static String WELCOME_TO_OUR_SYSTEM = "Welcome to our vehicle rental system!";

    public final static String GREETING_FOR_CHOICE_CAR = "Great choice! We need your first ant last name for your vehicle!";
    public final static String GREETING_FOR_CHOICE_MOTOR_CARGO = "Great choice! We need your first name,last name, your age and driven experience for your vehicle!";

    public final static String SELECT_VEHICLE_TYPE = "We offer several types of vehicles. Please choose between Car, Motorcycle and Cargo_Van.";
    public final static String SELECT_CAR = "We can offer you the following car brands and models: %s %s, %s %s\n";
    public final static String SELECT_MOTORCYCLE = "We can offer you the following car brands and models: %s %s, %s %s\n";
    public final static String SELECT_CARGO_VAN = "We can offer you the following car brands and models: %s %s, %s %s\n";

    public final static String RENT_PERIOD = "How many days will you rent the car for?";
    public final static String ACTUAL_RENT_PERIOD = "Hello, do you need to reduce the rental period? YES/NO";
    public final static String REDUCE_RENT_PERIOD = "With how many days you expected to reduce rental period?";

}
