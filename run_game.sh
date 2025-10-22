echo "Jagarkhin Shukris program"

DIR="Jagarkhin_Shukri_labb"
mkdir -p "$DIR"

cp *.java "$DIR"

cd "$DIR" || exit

echo "Running game from $(pwd)"

echo "Compiling..."
javac Guesser.java GuessingGame.java

echo "Running game..."
java GuessingGame

echo "Done!"

echo "Removing class files..."
rm -f *.class

ls -l
