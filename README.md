# Card Shuffle

This Java program performs a shuffle of a deck of cards represented as a singly linked list. The shuffle method splits the deck into two halves and then interleaves them to simulate a simple shuffle. The program includes a main method that runs some tests to demonstrate the shuffling process.

## Features

- **Singly Linked List Implementation:** The cards are represented as nodes in a singly linked list, where each node contains a card (integer value) and a reference to the next node.
- **Shuffle Method:** This method simulates shuffling a deck of cards by splitting the linked list into two halves and then interleaving the cards from each half.
- **Print Method:** A utility method to print the cards in the current order, showing the deck's state before and after shuffling.

## Usage

- **Creating a Deck:** The main method initializes a `CardShuffle` object and populates the singly linked list with nodes representing each card in the deck.
- **Shuffling the Deck:** The `cardShuffle` method is called to perform the shuffle operation, effectively simulating a single shuffle of the deck.
- **Displaying the Deck:** The `printCards` method is called to print the state of the deck to the console, allowing users to see the order of cards before and after shuffling.

## How It Works

- The program defines a `Node` class representing each card in the deck, with fields for the card's data (value) and a reference to the next card (`next`).
- The `CardShuffle` class contains the `head` of the linked list (the top card in the deck) and methods for shuffling and printing the deck.
- The `cardShuffle` method uses the tortoise and hare technique to find the middle of the list, then splits the list into two halves. It interleaves the two halves by alternatingly linking nodes from each half to simulate a shuffle.
- After shuffling, the `printCards` method traverses the list from the head, printing each card's value, to display the deck's current state.

## Running the Program

To run this program:

1. Compile the Java code using a Java compiler (e.g., `javac CardShuffle.java`).
2. Run the compiled class file with Java Runtime Environment (e.g., `java CardShuffle`).
3. Observe the output, which will display the deck's state before and after the shuffling process.

## Example Output

Assuming an initial deck of cards numbered from 1 to 9, the output might look like this before and after shuffling:

