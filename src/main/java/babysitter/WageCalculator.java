package babysitter;

public class WageCalculator {
    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
        return 0;
    }
}


// The Rules:
// The babysitter

// starts no earlier than 5:00PM.
// leaves no later than 4:00AM.
// gets paid $12/hour from the start of their shift to the children's bedtime.
// gets paid $8/hour from bedtime to midnight.
// gets paid $16/hour from midnight to the end of their shift.
// will start their shift on the hour and end their shift on the hour.
// The bedtime

// will be between 8:00PM and 11:00PM.
// can be before the start of the babysitter's shift.
// can be after the end of the babysitter's shift.
// The Feature:
// As a babysitter,

// In order to get paid for 1 night of work,

// I want to calculate my nightly wage.

// Create a method that takes the babysitter's start time, end time, and the children's 
// bedtime and returns the amount that the babysitter is owed for that shift. 
// You should use military/24 hour format for the start/end times.