// Get references to the form and the order summary paragraph
const form = document.getElementById('form');
const orderSummary = document.getElementById('order-summary');

// Define the Smoothie class
class Smoothie {
    constructor(size, flavour, orderType, milkType) {
        // Initialize the Smoothie object with user-provided details
        this.size = size;
        this.flavour = flavour;
        this.orderType = orderType;
        this.milkType = milkType;
    }

    // Method to return a string representation of the Smoothie details
    getOrderDetails() {
        return `
            Size: ${this.size}
            || Flavour: ${this.flavour}
            || Order Type: ${this.orderType}
            || Milk Type: ${this.milkType}
        `;
    }
}

// Add an event listener to handle the form submission
form.addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the page from refreshing on form submission

    // Capture the selected size, flavour, order type, and milk type from the form
    const size = document.querySelector('input[name="size"]:checked')?.value;
    const flavour = document.getElementById('flavour').value;
    const orderType = document.querySelector('input[name="order_type"]:checked')?.value;
    const milkType = document.querySelector('input[name="milk_type"]:checked')?.value;

    // Create a new Smoothie object with the captured values
    const smoothie = new Smoothie(size, flavour, orderType, milkType);

    // Call the getOrderDetails method to format the details
    const smoothieObject = smoothie.getOrderDetails();

    // Display the formatted details in the order summary paragraph
    orderSummary.innerHTML = smoothieObject;

    // Log the details to the console for debugging purposes
    console.log(smoothieObject);
});

