# university-Event-Management

A Simple Spring boot backent application to manage the events and students in the university.



## Tech Stack

**Client:** Postman

**Server:** Java, Maven, SpringBoot



## Functions Used

**Controller:** addStudent,addEvent,updateStudentDepartment,updateEvent,deleteStudent,deleteEvent,getAllStudents,getStudentById,getAllEventsByDate

**Services:** EventService[addEvent,updateEvent,,deleteEvent,getAllEventsByDate], StudentService[addStudent,,updateDept,deleteStudent,getAllStudents,getStudentById]

**Database Design:** Student[id,firstName,lastName,age,department], Event[eventId,eventName,Location,date,startTime,endTime]

**Repository:** StudentRepo,EventRepo[findAllByDate]



## Data-Structures Used

This project uses:

- h2

## Project Summary

This Project is based on spring boot framework and maven dependency manager.This is a simple backend application for manageing the events and students in the university.

