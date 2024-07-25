//Name- Dev Mehrotra
//Scholar Id - 2212181
//Cs 212 OOPS
// Question 4-

#include <iostream>

using namespace std;

class ticTacToe {
private:
    char board[3][3];
    char currentPlayer;

public:

    ticTacToe() {

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                board[i][j] = ' ';
            }
        }


        currentPlayer = 'X';
    }

    void printBoard() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                cout << board[i][j];
                if (j < 2) cout << " | ";
            }
            cout << endl;
            if (i < 2) cout << "---------" << endl;
        }
    }

    void getMove() {
            int row, col;
        while (true) {
            cout << "Player " << currentPlayer << ", enter your move (row and column(one based indexing)): ";
            cin >> row >> col;

            if (row == -1 && col == -1) {
                cout << "Exiting the game. Thanks for playing!" << endl;
                exit(0);
            }

            if (isValidMove(row, col)) {

                board[row - 1][col - 1] = currentPlayer;


                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                break;
            }
            // else continue;
        }
    }


    bool isValidMove(int row, int col) {
        if (row < 1 || row > 3 || col < 1 || col > 3 ) {
            cout << "Invalid move. Row and column must be between 1 and 3." << endl;
            return false;
        }

        if (board[row - 1][col - 1] != ' ') {
            cout << "Invalid move. Cell already occupied."<< endl;
            return false;
        }

        return true;
    }

    char checkWinner() {

        for (int i = 0; i < 3; ++i) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ')
                return board[i][0];

            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ')
                return board[0][i];
        }


        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ')
            return board[0][0];

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')
            return board[0][2];

        // return ' ';
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if(board[i][j]==' '){
                    return ' ';
                }

            }
            
        }
        return 't';
    }
};

int main() {
    while (true) {
        ticTacToe game;

        while (true) {
            game.printBoard();
            game.getMove();

            char winner = game.checkWinner();
            if (winner != ' ' and winner !='t') {
                game.printBoard();
                cout << "Player " << winner << " wins!" << endl;
                break;
            }
            else if(winner==' ') continue;
            else {
                cout<<"Its a tie!"<<endl;
                break;
            }
        
        }

        char playAgain;
        cout << "Do you want to play again? (y/n): ";
        cin >> playAgain;

        if (playAgain != 'y' && playAgain != 'Y') {
            cout << "Thanks for playing! Exiting the program." << endl;
            break;
        }
    }

    return 0;
}
