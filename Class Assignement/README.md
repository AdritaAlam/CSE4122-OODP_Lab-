<h1 align="center">UML Sequence Diagrams for ATM Machine</h1>

<img src="D:\CSE(4-1)\LAB\Object Oriented Design and Design Pattern\Lab_Assignemts(OOD)\Class Assignement\SequenceDiagramATM.png"/>

<br/>
<br/>

##	Introduction :
<br/>

<p align="left">
    
ATM (Automated Teller Machine) cash withdrawal is a convenient way for bank customers to get money from their bank accounts.In this report, a UML sequence diagram is presented that illustrates the interaction between a user and the ATM during a simple cash withdrawal transaction.


 
</p>
<br/>


##	Description:
<br/>
<p align = "left">

The key participants in this diagram are:

1. User: The individual who initiates the cash withdrawal process by interacting with the ATM.

2. ATM: The Automated Teller Machine itself, which provides the interface for the user.

3. Bank Server: The server component at the bank responsible for validating and authorizing withdrawal requests.

4. Bank Account: The financial institution that holds the user's account and processes withdrawal requests.


The operating process of the proposed ATM system can be summarized as the following steps:
- Initially, the user inserts their card into the ATM.
-   Then the ATM communicates with the bank server to verify the inserted card. If it is a valid card then the bank server confirms that the card is valid, and the ATM requests for the User's PIN. If the card is invalid, the bank server communicates that the card is invalid, and so the ATM returns the card.
-   Then the user enters their PIN.
-   The ATM verifies the entered PIN by communicating with the bank server.so, if the PIN is valid, the bank server confirms that the PIN is valid, and the ATM requests the withdrawal amount. If the PIN is not valid, the bank server communicates that the PIN is invalid, therefore the ATM returns the card.
-   After the validation of PIN, the user enters the amount they want to withdraw.
-   The transaction starts as the ATM initiates the transaction by communicating with the bank server. The Bank server checks if a sufficient amount of money is available in the bank. So, if there are sufficient funds, the Bank server communicates with the Bank Account to check the balance and confirms that there are enough funds for the withdrawal. The withdrawal is initiated, and the Bank Server notifies the ATM of a successful transaction. Then the ATM dispenses cash to the USer., if there are insufficient funds, the Bank Server communicates with the Bank Account, which confirms that there are insufficient funds. The bank server notifies the ATM of an unsuccessful transaction.
-   Finally, the ATM returns the User's card and completes the transaction.


</p>

</br>

##	conclusion:
<br/>
<p align = "left">
This sequence diagram provides a visual representation of the interactions between the User, ATM, Bank Server, and Bank Account during a cash withdrawal process through ATM machine. It also considers when the card or PIN is invalid and when there are insufficient funds in the account.

</p>





