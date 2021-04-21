#!/bin/bash

# Let's Echo
echo "HELLO";

#Write a Bash script which accepts name as input and displays the greeting "Welcome (name)"
read -p 'Insert your name: ' name
echo Welcome $name

#Read in one character from STDIN. If the character is 'Y' or 'y' display "YES".
# If the character is 'N' or 'n' display "NO". No other character will be provided as input.
read -p 'Insert one character: ' character
if [[ $character = 'Y' || $character = 'y' ]]
    then echo YES
elif [[ $character = 'N' || $character = 'n' ]]
    then echo NO
else 
    echo I said Insert one character...
fi
