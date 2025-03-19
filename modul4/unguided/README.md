# Clinic Management System

<p align="center">By: Ratih Ambara Sukma Kurnilia</p>

## Doctor.java
Kelas Doctor merupakan entitas dokter. Kelas Doctor memiliki properti private seperti:
1. name : untuk nama dokter
2. specialization : untuk spesialisasi dokter
3. doctorID : untuk ID dokter

## Patient.java
Kelas Patient mewakili entitas pasien. Kelas Patient memiliki properti private seperti:
1. name : untuk nama pasien
2. patientId : untuk ID pasien
3. diagnosis : untuk Diagnosa pasien yang merupakan data sensitif

## Appointment.java
Kelas Appointment dibuat untuk menghubungkan dokter dan pasien dalam janji temu. Kelas Appointment memiliki properti private seperti:
1. doctor : untuk dokter yang terlibat
2. patient : untuk pasien yang terlibat
3. appointmentTime : untuk melihat waktu janji temu dengan menggunakan LocalDateTime

## DataChecker.java
DataChecker ini merupakan utility class yang digunakan untuk menyediakan fungsi umum sehingga dapat digunakan kelas lain untuk membantu pemrosesan data tanpa membuat objek di dalam DataChecker sendiri. Kelas DataChecker ini digunakan untuk memeriksa kelengkapan data dengan metode:
1. isDoctorDataComplete(Doctor doctor) : untuk mengecek apakah data dokter lengkap
2. isPatientDataComplete(Patient patient) : untuk mengecek kelengkapan data pasien
3. isAppointmentDataComplete(Appointment appointment) : untuk memastikan data appointment valid

## DiagnosisCounter.java
DiagnosisCounter ini juga merupakan utility class untuk menghitung jumlah diagnosis berdasarkan daftar pasien. Kelas DiagnosisCounter ini menggunakan metode:
1. countDiagnoses(List<Patient> patients) : untuk mengembalikan map diagnosis dengan jumlah kemunculan masing-masing diagnosis.
2. Menggunakan map agar menyimpan data diagnosis sebagai key dan jumlahnya sebagai value, yang dapat dikembalikan.



Untuk kelas Doctor, Patient, dan Appointment menggunakan getter dan setter untuk dapat mengakses private field dengan lebih aman. Hasil dari testing kelas ini adalah
1. Menampilkan hasil cek kelengkapan data dokter, pasien, dan appointment dengan boolean true/false
2. Menampilkan daftar diagnosis dan jumlah diagnosis yang ditemukan dalam daftar pasien.



