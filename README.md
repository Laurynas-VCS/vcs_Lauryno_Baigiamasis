# Project Baigiamasis darbas
## Setup
### Site used for testing
[pigu](https://pigu.lt/lt/)
### Packages used
- TestNG `org.testng:testng`
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`
## Test cases 
### Login
Test 1 (logInWithValidInput)
1. open login page
2. input valid email address
3. input valid password
4. click "Prisijungti"
5. check if account name appears in profile page

Test 2 (logInWithInvalidInput)
1. open login page
2. input valid email address
3. input invalid password
4. click "Prisijungti"
5. Alert message appers, check if alert message is "Neteisingi prisijungimo duomenys"

Test3 (logout)
1. open login page
2. input valid email address
3. input valid password
4. click "Prisijungti"
5. move mouse to profile icon
6. click "Atsijungti"
7. check if we come back to log in page

### Dviraciai Search
Test 1 (puttingChosenMerchandiseToBuyingCart)
1. open "Dviraciai" page
2. select "Atsiimti siandien"
3. select "Rekomenduojamas ugis"
4. from given options choose and click "I krepseli"
5. click "Pirkti"
6. check if selected product is the same

### Vaikams_Kudikiams Searh

Test 1 (putTwoProductsInKrepselis)
1. open "Vaikams_Kudikiams" page
2. click "Lauko Zaislai"
3. from given options choose and click  "I krepseli"
4. click "Pirkti"
5. click "Rinktis daugiau prekiu"
6. click "Visos Prekes"
7. click "Kudikiu Prekes"
8. click "Maitinimo Priemones"
9. click "Maitinimo Kedutes"
10. from given options choose and click "I krepseli"
11. click "Pirkti"
12. check if selected product has the same name
13. check if second selected product has the same name