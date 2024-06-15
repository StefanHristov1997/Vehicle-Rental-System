# Vehicle-Rental-System
A simple functiional vehicle rental system that manages to rental and return processes of different types of vehicles.

# My Briefly Solution

1. First of all, I started with building the objects of the system, with the main one being Vehicle, which is inherited by the specified types of vehicles. Each vehicle is characterized by its brand, model, value, daily rental price, daily rental price with a discount, daily insurance price and daily insurance price with a discount.
   
2. The second step was to add specific types of vehicles, to which I added characteristics unique to each type of vehicle, such as the safety rating for cars and their specific rental and insurance prices per day.
  
3. Next, I created four additional classes: Rent, Insurance, Invoice, and Customer.
   The Rent class helps me store data about the customer who is renting the vehicle, the rented vehicle, the rental start date, the return date, the actual return date, the rental period, and the actual rental period.
   The Insurance class is designed to store data about the customer who is being charged for the insurance and the rented vehicle.
   The Invoice class is created to store invoice data, such as the customer, the vehicle, the rental agreement, insurance details, final rental amount, insurance amount, and the total invoice amount.
   The Customer class is where the customer's data is stored.

4. After creating all the components of the system, I made three helper classes: Rent Calculator, Insurance Calculator, and Invoice Calculator, which perform the business logic for calculating the rent, insurance, and 
   final invoice.

5. I made the application easier to maintain and better structured in the final stage by adding several additional utility classes such as PrintUtil, ValidatorUtil, CustomerUtil, RentUtil, and InvoiceUtil.
   PrintUtil assists with printing messages to the client, ValidatorUtil is for validating client input data, and the remaining three help with initializing specific objects.
