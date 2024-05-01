-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 24, 2023 at 06:30 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dentalmgmnt`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `doctor_id` int(11) NOT NULL,
  `doctor_name` varchar(50) DEFAULT NULL,
  `doctor_nophone` varchar(50) DEFAULT NULL,
  `doctor_email` varchar(50) DEFAULT NULL,
  `doctor_address` varchar(50) DEFAULT NULL,
  `doctor_username` varchar(50) DEFAULT NULL,
  `doctor_password` varchar(50) DEFAULT NULL,
  `Status` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`doctor_id`, `doctor_name`, `doctor_nophone`, `doctor_email`, `doctor_address`, `doctor_username`, `doctor_password`, `Status`) VALUES
(10001, 'Hafiz Suhaizal', '0159783421', 'hafiz@gmail.com', 'No 14, Jalan Melati, Ayer Keroh, 61000, Melaka', 'Hafiz', '1234', 'Active'),
(10002, 'Ng Wei Hen', '0125627899', 'ngweihen@gmail.com', 'No 1, Jalan Berjaya, Jasin, 76100, Melaka', 'Ng Wei Hen', '1111', 'Active'),
(10003, 'Muhammad Faiz', '0156742311', 'faiz@gmail.com', 'N0 6, Jalan Kasturi, Jasin, 76100, Melaka', 'Faiz', '1232', 'Active'),
(10004, 'Muhammad Izzat', '0123427896', 'izzat@gmail.com', 'No 2, Jalan Kenangan, Kuantan, 25100, Pahang', 'Izzat', '1212', 'Active'),
(10005, 'Muhammad Naufal', '0142136785', 'naufal@gmail.com', 'No 2, Jalan Terbuka, Kuantan, 24100, Pahang', 'Naufal', '1233', 'Active'),
(10006, 'Puteri Mykayla', '0174002772', 'mykayla@gmail.com', 'No 345, Jalan Mawar, Ayer Keroh, 76100, Melaka', 'mykayla', '454545', 'Active'),
(10007, 'Nur Hidayah', '0134779090', 'hidayah@gmail.com', 'No 5, Blok A, Flat Kuntum, Durian Tunggal, 76105, ', 'hidayah', '767676', 'Active'),
(10008, 'Siti Syafiqah', '0194567878', 'syafiqah@gmail.com', 'No 54, Jalan Bestari, Ayer Keroh, 76100, Melaka', 'syafiqah', '345345', 'Active'),
(10009, 'Kasih Mysaira', '0153002345', 'kasih@gmail.com', 'No 123, Jalan Mentari, Jasin, 65100, Melaka', 'kasih', '98765', 'Active'),
(10010, 'Rose Adliyana', '0187564432', 'rose@gmail.com', 'No 32, Kampung Sejati, Ayer Keroh,76100, Melaka', 'rose', '6543', 'Active'),
(10011, 'Adib Adliyana', '0124765944', 'liyana@gmail.com', 'No 5, Jalan 8, Kampung Merpati, 76100 Ayer Keroh', 'yana', '1234', 'Active'),
(10015, 'Ng Wei Hen', '0127786543', 'weihen@gmail.com', '7, Jalan 1, Taman Indah, 76100 Ayer Keroh', 'weihen', '12345', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `doctor_treatment`
--

CREATE TABLE `doctor_treatment` (
  `doctor_id` int(11) NOT NULL,
  `treatment_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor_treatment`
--

INSERT INTO `doctor_treatment` (`doctor_id`, `treatment_id`) VALUES
(10001, 111),
(10002, 115),
(10004, 116),
(10006, 117),
(10009, 111),
(10003, 119),
(10010, 120),
(10008, 115);

-- --------------------------------------------------------

--
-- Table structure for table `medicine`
--

CREATE TABLE `medicine` (
  `medicine_id` int(11) NOT NULL,
  `medicine_name` varchar(50) DEFAULT NULL,
  `medicine_type` varchar(50) DEFAULT NULL,
  `medicine_company` varchar(50) DEFAULT NULL,
  `medicine_cost` double DEFAULT NULL,
  `nurse_id` int(11) NOT NULL,
  `Status` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `medicine`
--

INSERT INTO `medicine` (`medicine_id`, `medicine_name`, `medicine_type`, `medicine_company`, `medicine_cost`, `nurse_id`, `Status`) VALUES
(56001, 'Local Anesthesia', 'control pain', 'Pharmacy Medicines', 6.67, 30001, 'Available'),
(56002, 'General Anesthesia', 'control pain', 'Pharmacy Medicines', 7.7, 30002, 'Available'),
(56003, 'Nitrous Oxide', 'control pain and anxiety', 'Pharmacy Medicines', 6.5, 30002, 'Available'),
(56004, 'Acetaminophen', 'control pain', 'Pharmacy Medicines', 5.79, 30003, 'Available'),
(56005, 'Penicillin', 'Antibiotics', 'Pharmacy Medicines', 8.05, 30005, 'Available'),
(56006, 'Amoxicillin', 'Antibiotics', 'Pharmacy Medicines', 7.7, 30006, 'Available'),
(56007, 'Nystatin', 'Oral Cavity', 'Pharmacy Medicines', 6.67, 30006, 'Available'),
(56008, 'Benzodiazepines', 'control pain and anxiety', 'Pharmacy Medicines', 5.79, 30007, 'Available'),
(56009, 'Antiseptics', 'Reduce Plaque', 'Pharmacy Medicines', 5.79, 30008, 'Available'),
(56010, 'Flouride', 'Prevent Tooth Decay', 'Pharmacy Medicines', 7.7, 30009, 'Available'),
(56011, 'Paracetamol', 'Tablet', 'Pharmacy', 7.5, 30008, 'Unavailable'),
(56015, 'Paracetamol', 'Pharmacy', 'Tablet', 7.6, 30008, 'Unavailable');

-- --------------------------------------------------------

--
-- Table structure for table `medicine_treatment`
--

CREATE TABLE `medicine_treatment` (
  `medicine_id` int(11) NOT NULL,
  `treatment_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `medicine_treatment`
--

INSERT INTO `medicine_treatment` (`medicine_id`, `treatment_id`) VALUES
(56001, 113),
(56003, 115),
(56004, 111),
(56005, 116),
(56006, 118),
(56007, 119),
(56001, 111),
(56009, 112);

-- --------------------------------------------------------

--
-- Table structure for table `nurse`
--

CREATE TABLE `nurse` (
  `nurse_id` int(11) NOT NULL,
  `nurse_name` varchar(50) DEFAULT NULL,
  `nurse_nophone` varchar(50) DEFAULT NULL,
  `nurse_email` varchar(50) DEFAULT NULL,
  `nurse_address` varchar(50) DEFAULT NULL,
  `nurse_username` varchar(50) DEFAULT NULL,
  `nurse_password` varchar(50) DEFAULT NULL,
  `doctor_id` int(11) NOT NULL,
  `Status` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nurse`
--

INSERT INTO `nurse` (`nurse_id`, `nurse_name`, `nurse_nophone`, `nurse_email`, `nurse_address`, `nurse_username`, `nurse_password`, `doctor_id`, `Status`) VALUES
(30001, 'Muhammad Radin', '0134467900', 'radin@gmail.com', 'No 234,Jalan Kemboja,781000,Melaka', 'radin', '345543', 10001, 'Active'),
(30002, 'Ahmad Farid', '0198677689', 'farid@gmail.com', 'No 99, Kampung Belatuk, Jasin76100,Melaka', 'farid', '900978', 10002, 'Active'),
(30003, 'Alia Kamelia', '0145678809', 'alia@gmail.com', 'No 56, Jalan Ziarah, 65000,Johor', 'alia', '447788', 10003, 'Active'),
(30004, 'Nur Huda', '01988325600', 'huda@gmail.com', 'No 14, Kampung Seri Kemboja,67100, Melaka', 'huda', '776543', 10004, 'Active'),
(30005, 'Qistina Ahmad', '0147788650', 'qistina@gmail.com', 'No 66, Kampung Hulu Lengat,76100,Melaka', 'qistina', '675431', 10004, 'Active'),
(30006, 'Putri Erina', '0175446677', 'erina@gmail.com', 'No 23, Jalan Melati, 76100, Melaka', 'erina', '895567', 10005, 'Active'),
(30007, 'Nur Fatimah', '0165544789', 'fatimah@gmail.com', 'No 75, Jalan Bestari,76100,Melaka', 'fatimah', '654328', 10005, 'Active'),
(30008, 'Nur Auni', '0125437899', 'auni@gmail.com', 'No 22, Jalan Mentari, Ayer Keroh, 76100, Melaka', 'auni', '565678', 10006, 'Active'),
(30009, 'Kirtana Baiduri', '0156677845', 'kirtana@gmail.com', 'No 657, Flat E,Jasin, Melaka', 'kirtana', '786543', 10007, 'Active'),
(30010, 'Seri Kemboja', '01456776588', 'kemboja@gmail.com', 'No 45, Kampung Bunga,76500,Melaka', 'kemboja', '001144', 10008, 'Active'),
(30015, 'Syafiqah Rozi', '0126789955', 'iqah@gmail.com', '78, Jalan 15, Taman Bersatu, 76100 Ayer Keroh', 'iqah', '3456', 10011, 'Inactive');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `patient_id` int(11) NOT NULL,
  `patient_name` varchar(50) DEFAULT NULL,
  `patient_nophone` varchar(50) DEFAULT NULL,
  `patient_email` varchar(50) DEFAULT NULL,
  `patient_address` varchar(100) DEFAULT NULL,
  `patient_username` varchar(50) DEFAULT NULL,
  `patient_password` varchar(50) DEFAULT NULL,
  `Status` varchar(12) NOT NULL,
  `age` int(3) NOT NULL,
  `gender` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`patient_id`, `patient_name`, `patient_nophone`, `patient_email`, `patient_address`, `patient_username`, `patient_password`, `Status`, `age`, `gender`) VALUES
(20001, 'Aura Kasih', '0167873545', 'aura@gmail.com', 'No 14 Jalan kemboja, 15350, Kuantan, Pahang', 'aura', '12321', 'Active', 45, 'F'),
(20002, 'Nada Cinta', '0165463786', 'nada@gmail.com', 'No 2, Jalan Kembangan, 23211, Ayer Molek, Melaka', 'nada', '343454', 'Active', 18, 'F'),
(20003, 'Rose Kekasih', '012432455', 'rose@gmail.com', 'No 3, Jalan Lalangan, 23435, Kota Bharu, Kelantan', 'rose', '121212', 'Active', 21, 'F'),
(20004, 'Auni Afeeqah', '0123432726', 'auni@gmail.com', 'No 3, Tingkat 1 Taman Indera, 23211, Melaka', 'auni', '232343', 'Active', 20, 'F'),
(20005, 'Anis Sabrina', '0122343234', 'anis@gmail.com', 'No 2, Tingkat 3, Jalan Kota, 23211, Kuantan, Pahang', 'anis', '232343', 'Active', 16, 'F'),
(20006, 'Muhammad Azrul', '0124355454', 'azrul@gmail.com', 'No 13, Taman Buaya, 23244, Ipoh, Perak', 'azrul', '565758', 'Active', 34, 'M'),
(20007, 'Muhammad Hafiz', '0123235674', 'hafiz@gmail.com', 'No 4, Tingkat 5, Blok Kasturi, 23422, UTeM, Melaka', 'hafiz2', '121232', 'Active', 32, 'M'),
(20008, 'Galang Rahman Wahid', '0145678798', 'galang@gmail.com', 'No 34, Taman Melati, 23456, Temasik, Kuala Terengganu', 'galang', '233223', 'Active', 66, 'M'),
(20009, 'Rizky Saputra', '0132423545', 'rizky@gmail.com', 'No 7, Tingkat 2, 23244, Parit Buntar, Johor', 'rizky', '676767', 'Active', 38, 'M'),
(20010, 'Gavin Ali', '0167872343', 'gavin@gmail.com', 'No 3, Taman Kerang, 34243, Johor Bahru, Johor', 'gavin', '121212', 'Active', 46, 'M'),
(20015, 'Shaufy Yana', '0123451234', 'shau@gmail.com', 'no. 4, Jalan Melati, 76100 Melaka', 'shau', '123', 'Inactive', 21, 'F');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `payment_id` int(11) NOT NULL,
  `payment_type` varchar(50) DEFAULT NULL,
  `payment_description` varchar(50) DEFAULT NULL,
  `payment_amount` double DEFAULT NULL,
  `payment_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`payment_id`, `payment_type`, `payment_description`, `payment_amount`, `payment_date`) VALUES
(7001, 'cash', 'treatment full package', 100, '2022-12-29'),
(7002, 'debit card', 'treatment full package', 250, '2022-12-29'),
(7003, 'cash', 'treatment full package', 100, '2022-12-29'),
(7004, 'debit card', 'treatment half package', 70, '2022-12-27'),
(7005, 'cash', 'treatment full package', 150, '2022-12-27'),
(7006, 'debit card', 'treatment half package', 70, '2022-12-28'),
(7007, 'debit card', 'treatment full package', 300, '2022-12-29'),
(7008, 'debit card', 'treatment half package', 100, '2022-12-28'),
(7009, 'cash', 'treatment half package', 150, '2022-12-28'),
(7010, 'debit card', 'treatment full package', 250, '2022-12-30'),
(7015, 'cash', 'Complete Payment', 15.75, '2023-01-24'),
(7018, 'debit card', 'Payment Complete', 159, '2023-01-24'),
(7021, 'cash', 'Complete', 14.2, '2023-01-24'),
(7054, 'debit card', 'Complete payment', 135, '2023-01-24');

-- --------------------------------------------------------

--
-- Table structure for table `treatment`
--

CREATE TABLE `treatment` (
  `treatment_id` int(11) NOT NULL,
  `treatment_name` varchar(50) DEFAULT NULL,
  `treatment_type` varchar(50) DEFAULT NULL,
  `treatment_description` varchar(100) DEFAULT NULL,
  `treatment_date` date DEFAULT NULL,
  `treatment_price` double NOT NULL,
  `payment_id` int(11) NOT NULL,
  `Status` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `treatment`
--

INSERT INTO `treatment` (`treatment_id`, `treatment_name`, `treatment_type`, `treatment_description`, `treatment_date`, `treatment_price`, `payment_id`, `Status`) VALUES
(111, 'Bridges', 'Traditional', 'Fill in bad cavity', '2022-12-28', 94, 7001, 'Available'),
(112, 'Implant', 'Endosteal', 'Artificial root drilled into jawbone', '2022-12-28', 65, 7004, 'Available'),
(113, 'Vaneers', 'Traditional', 'Grinding down natural tooth enamel', '2022-12-28', 95, 7003, 'Available'),
(114, 'Dental Fillings', 'Composite Resins', 'White filling to fill in the cavity', '2022-12-28', 70, 7004, 'Available'),
(115, 'Crowns', 'Traditional', 'Cap placed over an entire tooth', '2022-12-28', 80, 7005, 'Available'),
(116, 'Dental Fillings', 'Glass ionomer', 'Fill in a cavity by material opaque', '2022-12-28', 70, 7005, 'Available'),
(117, 'Dental Filling', 'Resin-modified Glass ionomer', 'Fill in cavity by material similar to enamel color', '2022-12-28', 90, 7006, 'Unavailable'),
(118, 'Implants', 'Subperiosteal', 'The artificial root place above jawbone', '2022-12-28', 80, 7006, 'Available'),
(119, 'Bridges', 'Maryland', 'Cover healthy teeth with crowns', '2022-12-28', 75, 7007, 'Available'),
(120, 'Bridges', 'Cantilever', 'Cover the healthy teeth with crowns ', '2022-12-28', 95, 7008, 'Available');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`doctor_id`);

--
-- Indexes for table `medicine`
--
ALTER TABLE `medicine`
  ADD PRIMARY KEY (`medicine_id`),
  ADD KEY `nurse_id` (`nurse_id`);

--
-- Indexes for table `nurse`
--
ALTER TABLE `nurse`
  ADD PRIMARY KEY (`nurse_id`),
  ADD KEY `doctor_id` (`doctor_id`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`patient_id`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`payment_id`);

--
-- Indexes for table `treatment`
--
ALTER TABLE `treatment`
  ADD PRIMARY KEY (`treatment_id`),
  ADD KEY `payment_id` (`payment_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `medicine`
--
ALTER TABLE `medicine`
  ADD CONSTRAINT `medicine_ibfk_1` FOREIGN KEY (`nurse_id`) REFERENCES `nurse` (`nurse_id`);

--
-- Constraints for table `nurse`
--
ALTER TABLE `nurse`
  ADD CONSTRAINT `nurse_ibfk_1` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`doctor_id`);

--
-- Constraints for table `treatment`
--
ALTER TABLE `treatment`
  ADD CONSTRAINT `treatment_ibfk_1` FOREIGN KEY (`payment_id`) REFERENCES `payment` (`payment_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
