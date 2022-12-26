-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 17, 2022 at 04:38 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bookingshotel`
--
CREATE DATABASE IF NOT EXISTS `bookingshotel` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bookingshotel`;

-- --------------------------------------------------------

--
-- Table structure for table `amenities`
--

CREATE TABLE `amenities` (
  `id` int(11) NOT NULL,
  `amenityName` varchar(50) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `amenities`
--

INSERT INTO `amenities` (`id`, `amenityName`, `status`) VALUES
(1, 'Bar', 1),
(2, 'Poll', 1),
(3, 'SPA', 1),
(4, 'Wifi', 1),
(5, 'Television', 1);

-- --------------------------------------------------------

--
-- Table structure for table `bookings`
--

CREATE TABLE `bookings` (
  `id` varchar(10) NOT NULL,
  `guestName` varchar(100) NOT NULL,
  `checkInDate` date NOT NULL,
  `checkOutDate` date NOT NULL,
  `numberOfAdults` int(11) NOT NULL,
  `numberOfChildrens` int(11) NOT NULL,
  `status` char(15) NOT NULL,
  `roomId` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bookings`
--

INSERT INTO `bookings` (`id`, `guestName`, `checkInDate`, `checkOutDate`, `numberOfAdults`, `numberOfChildrens`, `status`, `roomId`) VALUES
('B-2eZ1z', 'Fajar', '2022-12-17', '2022-12-18', 1, 0, 'Booked', 'R-CYKPY'),
('B-68IxJ', 'Rian', '2022-12-04', '2022-12-10', 3, 2, 'Checking Out', 'R-H0ErV'),
('B-78dm7', 'Arif', '2022-12-05', '2022-12-07', 3, 1, 'Checking Out', 'R-Iui3W'),
('B-9qOv8', 'Aris', '2022-12-08', '2022-12-10', 2, 0, 'Checking Out', 'R-CYKPY'),
('B-c4IZN', 'Rio', '2022-12-17', '2022-12-18', 2, 2, 'Booked', 'R-H0ErV'),
('B-frhOn', 'Aang', '2022-12-04', '2022-12-05', 2, 2, 'Checking Out', 'R-wnl87'),
('B-lFSzZ', 'Angga K', '2022-12-17', '2022-12-19', 2, 1, 'Checking Out', 'R-wnl87'),
('B-U8P3E', 'Aang', '2022-12-16', '2022-12-17', 2, 2, 'Checking Out', 'R-Iui3W');

-- --------------------------------------------------------

--
-- Table structure for table `bookingservice`
--

CREATE TABLE `bookingservice` (
  `id` int(11) NOT NULL,
  `bookingId` varchar(10) NOT NULL,
  `serviceId` int(11) NOT NULL,
  `tgl_service` date NOT NULL,
  `amount` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bookingservice`
--

INSERT INTO `bookingservice` (`id`, `bookingId`, `serviceId`, `tgl_service`, `amount`, `total`) VALUES
(1, 'B-lFSzZ', 1, '2022-12-17', 1, 150000),
(2, 'B-lFSzZ', 2, '2022-12-17', 2, 400000);

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `id` int(11) NOT NULL,
  `nights` int(11) NOT NULL,
  `total` varchar(20) NOT NULL,
  `bookingId` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `invoice`
--

INSERT INTO `invoice` (`id`, `nights`, `total`, `bookingId`) VALUES
(1, 1, '500000', 'B-frhOn'),
(2, 2, '1500000', 'B-78dm7'),
(3, 2, '1000000', 'B-9qOv8'),
(4, 2, '1000000', 'B-lFSzZ'),
(5, 1, '750000', 'B-U8P3E');

-- --------------------------------------------------------

--
-- Table structure for table `roomamenity`
--

CREATE TABLE `roomamenity` (
  `id` int(11) NOT NULL,
  `roomId` varchar(10) NOT NULL,
  `amenityId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `roomamenity`
--

INSERT INTO `roomamenity` (`id`, `roomId`, `amenityId`) VALUES
(8, 'R-b1IuT', 1),
(7, 'R-H0ErV', 1);

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `id` varchar(10) NOT NULL,
  `roomNumber` int(11) NOT NULL,
  `adultCapacity` int(11) NOT NULL,
  `childrenCapacity` int(11) NOT NULL,
  `price` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`id`, `roomNumber`, `adultCapacity`, `childrenCapacity`, `price`) VALUES
('R-b1IuT', 103, 4, 4, '800000'),
('R-CYKPY', 105, 2, 1, '500000'),
('R-H0ErV', 102, 4, 2, '750000'),
('R-Iui3W', 101, 4, 2, '750000'),
('R-wnl87', 104, 2, 2, '500000');

-- --------------------------------------------------------

--
-- Table structure for table `services`
--

CREATE TABLE `services` (
  `id` int(11) NOT NULL,
  `serviceName` varchar(50) NOT NULL,
  `price` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `services`
--

INSERT INTO `services` (`id`, `serviceName`, `price`) VALUES
(1, 'Bir', '150000'),
(2, 'SPA', '200000'),
(4, 'Potato and Leek Soup', '50000'),
(5, 'Fresh Garden Salad', '80000'),
(6, 'Juice', '25000'),
(7, 'Cheese Burger Piza', '100000'),
(8, 'Brownies', '50000'),
(9, 'Nasi Goreng', '50000'),
(10, 'Beef Rendang', '120000');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `fullName` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `level` enum('Staf','Guest') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `fullName`, `password`, `level`) VALUES
(1, 'admin', 'Administrator', 'admin', 'Staf');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `amenities`
--
ALTER TABLE `amenities`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bookings`
--
ALTER TABLE `bookings`
  ADD PRIMARY KEY (`id`),
  ADD KEY `roomId` (`roomId`);

--
-- Indexes for table `bookingservice`
--
ALTER TABLE `bookingservice`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `bookingId` (`bookingId`,`serviceId`),
  ADD KEY `serviceId` (`serviceId`);

--
-- Indexes for table `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`id`),
  ADD KEY `bookingId` (`bookingId`);

--
-- Indexes for table `roomamenity`
--
ALTER TABLE `roomamenity`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `roomId` (`roomId`,`amenityId`),
  ADD KEY `amenityId` (`amenityId`);

--
-- Indexes for table `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `roomNumber` (`roomNumber`);

--
-- Indexes for table `services`
--
ALTER TABLE `services`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `amenities`
--
ALTER TABLE `amenities`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `bookingservice`
--
ALTER TABLE `bookingservice`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `invoice`
--
ALTER TABLE `invoice`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `roomamenity`
--
ALTER TABLE `roomamenity`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `services`
--
ALTER TABLE `services`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bookings`
--
ALTER TABLE `bookings`
  ADD CONSTRAINT `bookings_ibfk_1` FOREIGN KEY (`roomId`) REFERENCES `rooms` (`id`);

--
-- Constraints for table `bookingservice`
--
ALTER TABLE `bookingservice`
  ADD CONSTRAINT `bookingservice_ibfk_1` FOREIGN KEY (`bookingId`) REFERENCES `bookings` (`id`),
  ADD CONSTRAINT `bookingservice_ibfk_2` FOREIGN KEY (`serviceId`) REFERENCES `services` (`id`);

--
-- Constraints for table `invoice`
--
ALTER TABLE `invoice`
  ADD CONSTRAINT `invoice_ibfk_1` FOREIGN KEY (`bookingId`) REFERENCES `bookings` (`id`);

--
-- Constraints for table `roomamenity`
--
ALTER TABLE `roomamenity`
  ADD CONSTRAINT `roomamenity_ibfk_1` FOREIGN KEY (`roomId`) REFERENCES `rooms` (`id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `roomamenity_ibfk_2` FOREIGN KEY (`amenityId`) REFERENCES `amenities` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
