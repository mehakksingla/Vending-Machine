// console.log("Hello");   testing console just to make sure that everything is working well

//create some variables and we are going to see how much money user is putting in to get the item. Based on this, we will test the vending machine.
var change = 0;
var moneyInserted = 0;

var msg ="";

var chocolates = ["Twix", "Aero", "Kitkat", "Mars", "Lindt"];
const price = 2.00;

var messageE1 = document.getElementById("message");
var totalPaid = 0;


const currency_loonie = 1;
const currency_toonie = 2;
const currency_nickel = 0.05;
const currency_dime = 0.1;
const currency_quarter = 0.25;


function getTotal() {
    var currency_loonies = Number(document.getElementById("loonies").value);
    var currency_toonies = Number(document.getElementById("toonies").value);
    var currency_nickels = Number(document.getElementById("nickels").value);
    var currency_dimes = Number(document.getElementById("dimes").value);
    var currency_quarters = Number(document.getElementById("quarters").value);


    if (currency_loonies > 0) {
    currency_loonies = currency_loonies * currency_loonie;
    }
    if (currency_toonies > 0) {
    currency_toonies = currency_toonies * currency_toonie;
    }
    if (currency_nickels > 0) {
        currency_nickels = currency_nickels * currency_nickel;
    }
    if (currency_dimes > 0) {
        currency_dimes = currency_dimes * currency_dime;
    }
    if (currency_quarters > 0) {
        currency_quarters = currency_quarters * currency_quarter;
    }

    totalPaid = currency_loonies + currency_toonies + currency_nickels + currency_dimes + currency_quarters;
    return totalPaid.toFixed(2);

}

// console.log(getTotal());


function tally() {                                                      //create function to get the total of the amount paid
    moneyInserted = getTotal();
    document.getElementById("paid").innerHTML = moneyInserted;
}


function clearTotalAmount() {                                           //create function to clear the total amount paid
    moneyInserted = 0;
    document.getElementById("paid").innerHTML = moneyInserted;
}


function clearForm() {                                                  //this function will clear the values inside the columns
    document.getElementById("loonies").value = 0;
    document.getElementById("toonies").value = 0;
    document.getElementById("nickels").value = 0;
    document.getElementById("dimes").value = 0;
    document.getElementById("quarters").value = 0;
}


function cancel() {                                                        //clear the form and clear the total amount paid - both

    getTotal();

    if(totalPaid > 0) {
        msg = "Transaction Cancelled. $" + totalPaid.toFixed(2) + "has been returned to the coin tray.";
        clearForm();
        clearTotalAmount();
        messageE1.innerHTML = msg;
        
    }else if (totalPaid == 0) {
        msg = "Insert coin first. Select the item."
        messageE1.innerHTML = msg;
    }
}

function calculateChange() {
    var tempChange = 0;

    if(getTotal() != 0) {
        return (tempChange = (getTotal() - price).toFixed(2));
    }
    return tempChange.toFixed(2);
}

function dispenseChocolate(chocolate) {
    messageE1.innerHTML = "";
    change = 0;
    var selectedChoc = chocolates[chocolate];

    change = calculateChange();

    if(change < 0) {
        msg = "You did not pay enough. $" + totalPaid.toFixed(2) + " has been returned to the coin tray.";
        totalPaid = 0;
        change =0;
        clearForm();
        clearTotalAmount();

        messageE1.innerHTML = msg;
    
    }else if (change > 0) {
        msg = selectedChoc + " has been dispensed. $" + change + " has been returned to the coin tray.";
        totalPaid = 0;
        change =0;
        clearForm();
        clearTotalAmount();

        messageE1.innerHTML = msg;
    }else if (totalPaid ==0) {
        msg = "Please pay before selecting the item.";
        messageE1.innerHTML = msg;
    } else if (change == 0) {
        msg = selectedChoc + " has been dispensed.";
        totalPaid = 0;
        change =0;
        clearForm();
        clearTotalAmount();

        messageE1.innerHTML = msg;
    }
}