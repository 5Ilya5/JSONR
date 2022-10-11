public class output {
    for (Person friend : person.friends) {
        System.out.print(friend.lastName);
        for (Phones phone : friend.phoneNumbers) {
            System.out.println(" - phone type: " + phone.type + ", phone number : " + phone.number);
        }
    }
}
