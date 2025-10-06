//1st file

//(Optimized)using single loop://todo



//(Brute Force)using two Loops:
function getSecondLargest(arr) {

    let secondLargest = -Infinity;
    let largest = arr[0];
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > largest) {
            largest = arr[i];
        }
    }
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > secondLargest && arr[i] < largest) {
            secondLargest = arr[i];
        }
    }
    return secondLargest === -Infinity ? -1 : secondLargest;
}