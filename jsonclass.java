public class jsonclass {
    
    class Person {
        public String firstName;
        public String lastName;
        public int age;
        public Address address;
        public List <Phones> phoneNumbers;
        public List <Person> friends;
    }
    
    class Address {
        public String streetAddress;
        public String city;
        public String state;
        public int postalCode;
    }
    
    class Phones {
        public String type;
        public String number;
    }
    
    for (Person friend : person.friends) {
        System.out.print(friend.lastName);
        for (Phones phone : friend.phoneNumbers) {
            System.out.println(" - phone type: " + phone.type + ", phone number : " + phone.number);
        }
    }
}
