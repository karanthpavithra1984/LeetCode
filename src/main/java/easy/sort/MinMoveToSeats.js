let minMovesToSeat = function (seats, students) {
    seats.sort((a, b) => a - b);
    students.sort((a, b) => a - b);
    let difference = 0;

    for (let i = 0; i < seats.length; i++) {
        difference += Math.abs(seats[i] - students[i]);
    }

    return difference;
};

let minMovesToSeatCountingSort = function (seats, students) {
    let maxSeat = Math.max(Math.max(...seats), Math.max(...students));

    let differences = new Array(maxSeat + 1).fill(0);

    for (let seat of seats) {
        differences[seat]++;
    }

    for (let student of students) {
        differences[student]--;
    }

    let moves = 0;
    let unmatched = 0;
    for (let i = 0; i < differences.length; i++) {
        moves += Math.abs(unmatched);
        unmatched += differences[i];
    }

    return moves;
};