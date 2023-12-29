API URL for different Services


API Gateway(For all the services)

1. create-customer - > http://localhost:8081/api/customers

	pass the following details in post method
	{
        "firstName": "Jyoti",
        "lastName": "kumari",
        "accountNumber": "2134567823",
        "email": "jyoti@gmail.com"
}

2. Get Customers -> http://localhost:8081/api/customers

3. Get single customer -> http://localhost:8081/api/customers/{id}


4. Create Account -> http://localhost:8082/accounts{id}

	pass the following details in post method

	{
    		"balance" : 1000,		
	}

5. Get Accounts -> http://localhost:8082/accounts{id}
6. Add money ->    http://localhost:8082/accounts{id}/add-money?amount=100
7. Withdraw Money -> http://localhost:8082/accounts{id}/withdraw-money?amount=100

6. Delete Account -> http://localhost:8082/accounts/{Id}

7. Delete Customer -> http://localhost:8081/api/customers/{id}



CUSTOMER-SERVICE is running on port 8081
ACCOUNT-SERVICE is running on port 8082
API-GATEWAY is running on port 8083
SERVICE-CONFIG is running on port 8084
SERVICE-Registry(EUREKA) is running on port 8761 