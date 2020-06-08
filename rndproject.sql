-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2020 at 06:11 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.1.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rndproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `blog`
--

CREATE TABLE `blog` (
  `sno` int(10) NOT NULL,
  `ttext` varchar(500) DEFAULT NULL,
  `uid` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `stdate` varchar(50) DEFAULT NULL,
  `star` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `blog`
--

INSERT INTO `blog` (`sno`, `ttext`, `uid`, `email`, `stdate`, `star`) VALUES
(1, 'hi', 'krishna', 'krishnabankar62@gmail.com', 'Wed Mar 11 19:49:09 IST 2020', 2),
(2, 'hello', 'krishna', 'krishnabankar62@gmail.com', 'Wed Mar 11 19:49:23 IST 2020', 3),
(3, '1245', 'samajh kumar', 'samajh@yahoo.com', 'Wed Mar 11 20:52:08 IST 2020', 2),
(4, 'your service are amazing.', 'samajh kumar', 'samajh@yahoo.com', 'Fri Mar 13 11:25:46 IST 2020', 3),
(5, 'these are the best application services.', 'krishna bankar', 'krishnabankar62@gmail.com', 'Fri Mar 13 11:29:01 IST 2020', 5),
(6, 'okey fine', 'krishna bankar', 'krishnabankar62@gmail.com', 'Fri Mar 13 12:18:43 IST 2020', 2);

-- --------------------------------------------------------

--
-- Table structure for table `email_subscription`
--

CREATE TABLE `email_subscription` (
  `email_id` varchar(30) DEFAULT NULL,
  `s_no` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `email_subscription`
--

INSERT INTO `email_subscription` (`email_id`, `s_no`) VALUES
('krishnabankar62@gmail.com', 1),
('krishnabankar72@yahoo.com', 2),
('krishnabankar52@twitter.com', 3),
('krishnabankar52@twitter.com', 4),
('krishnabankar52@twitter.com', 5),
('krishnabankar85@yahoo.com', 6),
('krishnabankar85@yahoo.com', 7),
('', 8),
('krishnabankar72@yahoo.com', 9);

-- --------------------------------------------------------

--
-- Table structure for table `expert`
--

CREATE TABLE `expert` (
  `name` varchar(20) DEFAULT NULL,
  `mobileNumber` varchar(20) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `location` varchar(20) DEFAULT NULL,
  `skill` varchar(40) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `aadharNumber` varchar(20) DEFAULT NULL,
  `typeOfService` varchar(20) DEFAULT NULL,
  `typeOfPlatform` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `passWord` varchar(20) DEFAULT NULL,
  `qualification` varchar(50) DEFAULT NULL,
  `subDomain` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expert`
--

INSERT INTO `expert` (`name`, `mobileNumber`, `email`, `location`, `skill`, `sex`, `aadharNumber`, `typeOfService`, `typeOfPlatform`, `address`, `passWord`, `qualification`, `subDomain`) VALUES
('wasif', '7528520', 'name@gmail.com', 'delhi ncr', 'mtech ai', 'male', '125852', 'free', 'online', NULL, NULL, NULL, NULL),
('sonali', '1255578452', 'seraj@mail.com', 'hyderabad', 'mtech it', 'female', '78964152', 'paid', 'homeTution', NULL, NULL, NULL, NULL),
('shiv', '456', 'shiv@gmail.com', 'hyderabad', 'mca', 'male', '78964152', 'free', 'online', NULL, NULL, NULL, NULL),
('durga', '789456122', 'durga@soft.com', 'banglore', 'marketing', 'female', '49523652', 'free', 'homeTution', NULL, NULL, NULL, NULL),
('roshni', '741852963', 'roshni@roshni.roshni', 'pune', 'human resource', 'female', '+625263', 'free', 'online', NULL, NULL, NULL, NULL),
('arti', '78888', 'kk@mail.net', 'indore', 'finance', 'female', '78964152', 'paid', 'homeTution', NULL, NULL, NULL, NULL),
('rahul', '8595954', 'ajlkjkalj@kj.colm', 'indore', 'finance', 'male', '987429621', 'free', 'online', NULL, NULL, NULL, NULL),
('M WASIF', '07036393961', 'mobinwasif@gmail.com', 'Hyderabad', 'mca', 'male', '', 'free', 'expertPlace', 'AT, PO AND PS - LESLIGANJ', NULL, NULL, NULL),
('kartik arya', '4569875326', 'kartik@kar.ac.in', 'Hyderabad', 'finance', 'male', '456789123963', 'free', 'WhatsApp', 'hcu flag mca', NULL, NULL, NULL),
('anup soni', '4578789654', 'anup@soni.ac', 'Hyderabad', 'finance', 'male', '456789321456', 'free', 'WhatsApp', 'custom address', NULL, NULL, NULL),
('vishal jain', '7528527418', 'vishal@jain.com', 'Hyderabad', 'finance', 'male', '789456123456', 'free', 'WhatsApp', 'hcumca hcumca', NULL, NULL, NULL),
('krishana bankar', '8516956613', 'krishnabankar62@gmail.com', 'indore', 'human resource', 'other', '753518525644', 'honorarium', 'expertPlace', 'MH F,\r\nUnivresity Of Hyderabad', NULL, NULL, NULL),
('samajh kumar', '1245365214', 'samajh@yahoo.com', 'delhi ncr', 'mtech it', 'female', '789456123456', 'paid', 'userPlace', 'mh f , mh i', '12345', NULL, NULL),
('krishna bankar', '8516956613', 'krishnabankar62@gmail.com', 'delhi ncr', 'mca', 'male', '789456123456', 'free', 'WhatsApp', 'mh f, hcu', '123123', NULL, NULL),
('ramanujan sagar', '5487452136', 'ramanujan@sagar.co.in', 'Hyderabad', 'finance', 'male', '789456123456', 'free', 'WhatsApp', 'NewYork city, America, Yourope', 'ramayan', 'Ramayan, Mahabharat', NULL),
('azar amar', '3698521478', 'azar@amar.com', 'Hyderabad', 'finance', 'male', '987429612345', 'free', 'WhatsApp', 'hyderabad, gopanpali, telangana', 'azar', 'DevOps', 'Gopanpali'),
('khalid master', '8516956613', 'krishnabankar52@yahoo.com', 'hyderabad', 'finance', 'male', '753518525648', 'free', 'WhatsApp', 'MH F,\r\nUnivresity Of Hyderabad', '1425', 'master of computer', 'HYDERABAD');

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `uid` varchar(20) DEFAULT NULL,
  `passwd` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mono` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`uid`, `passwd`, `email`, `mono`) VALUES
('krishna', '12345', 'krishnabankar62@gmail.com', '8516956613');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `name` varchar(20) DEFAULT NULL,
  `mobileNumber` varchar(20) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `location` varchar(20) DEFAULT NULL,
  `skill` varchar(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `aadharNumber` varchar(20) DEFAULT NULL,
  `typeOfService` varchar(20) DEFAULT NULL,
  `typeOfPlatform` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `passWord` varchar(20) DEFAULT NULL,
  `qualification` varchar(50) DEFAULT NULL,
  `subDomain` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`name`, `mobileNumber`, `email`, `location`, `skill`, `sex`, `aadharNumber`, `typeOfService`, `typeOfPlatform`, `address`, `passWord`, `qualification`, `subDomain`) VALUES
('krishana bankar', '8516956613', 'krishnabankar62@gmail.com', 'banglore', 'mca', 'male', '12', 'free', 'online', NULL, NULL, NULL, NULL),
('sandeep gohain', '1234567890', 'gohain@hotmail.com', 'banglore', 'finance', 'male', '123456', 'paid', 'homeTution', NULL, NULL, NULL, NULL),
('suman', '7485963', 'anr@ail.com', 'indore', 'business analytics', 'female', '852741526352', 'paid', 'homeTution', NULL, '1234', NULL, NULL),
('sachin josi', '78965485262', 'sachin@yahoo.com', 'channai', 'In Organic', 'male', '987429621', 'paid', 'online', NULL, NULL, NULL, NULL),
('manish', '777744444444441111', 'manish@twiter.com', 'indore', 'finance', 'male', '85262', 'paid', 'homeTution', NULL, NULL, NULL, NULL),
('anurag panday', '7528520', 'anurag@panday.com', 'delhi ncr', 'marketing', 'male', '7535185256', 'free', 'online', NULL, NULL, NULL, NULL),
('ashish', '74141741', 'ashish@man.nit', 'pune', 'human resource', 'male', '75385201', 'free', 'homeTution', NULL, NULL, NULL, NULL),
('ananya', '08516852423', 'anr@ail.com', 'channai', 'general', 'female', '123456', 'free', 'homeTution', NULL, NULL, NULL, NULL),
('akshy kumar', '7528520', 'akshy@mail.com', 'Hyderabad', 'mtech cs', 'male', '789456123456', 'free', 'homeTution', NULL, NULL, NULL, NULL),
('rohit', '54658756', 'rohit@yahoo.com', 'banglore', 'human resource', 'other', '74185206341', 'honorarium', 'studyPlace', NULL, NULL, NULL, NULL),
('ahmad', '4548569845', 'ahmad@uoh.ac.in', 'indore', 'finance', 'male', '123456', 'paid', 'on', NULL, NULL, NULL, NULL),
('', '', '', 'Hyderabad', 'human resource', 'male', '', 'free', 'on', NULL, NULL, NULL, NULL),
('', '', '', 'Hyderabad', 'human resource', 'male', '', 'free', 'on', NULL, NULL, NULL, NULL),
('', '', '', 'Hyderabad', 'finance', 'male', '', 'free', 'on', NULL, NULL, NULL, NULL),
('', '', '', 'Hyderabad', 'general', 'male', '', 'free', 'on', NULL, NULL, NULL, NULL),
('', '', '', 'Hyderabad', 'operations', 'male', '', 'free', 'on', NULL, NULL, NULL, NULL),
('', '', '', 'Hyderabad', 'operations', 'male', '', 'free', 'on', NULL, NULL, NULL, NULL),
('', '', '', 'Hyderabad', 'materials', 'male', '', 'free', 'on', NULL, NULL, NULL, NULL),
('', '', '', 'Hyderabad', 'general', 'male', '', 'honorarium', 'on', NULL, NULL, NULL, NULL),
('', '', '', 'Hyderabad', 'operations', 'male', '', 'free', 'on', NULL, NULL, NULL, NULL),
('', '', '', 'Hyderabad', 'human resource', 'male', '', 'free', 'on', NULL, NULL, NULL, NULL),
('', '', '', 'Hyderabad', 'marketing', 'male', '', 'free', 'expertPlace', NULL, NULL, NULL, NULL),
('', '', '', 'Hyderabad', 'human resource', 'male', '', 'free', '', NULL, NULL, NULL, NULL),
('', '', '', 'Hyderabad', 'general', 'male', '', 'free', 'userPlace', NULL, NULL, NULL, NULL),
('harsha', '74141741', 'harsha@mail.com', 'delhi ncr', 'mca', 'male', '789456123456', 'honorarium', 'Mail', 'MH F,\r\nUnivresity Of Hyderabad', NULL, NULL, NULL),
('yash mehera', '9674854569', 'yash@uohyd.ac.in', 'Hyderabad', 'finance', 'male', '121212121212', 'free', 'WhatsApp', 'MH F,Univresity Of Hyderabad', NULL, NULL, NULL),
('kumar sanu', '4587569562', 'kumar@sanu.com', 'Hyderabad', 'finance', 'male', '748574857485', 'free', 'WhatsApp', 'kumar sanu, mh f', NULL, NULL, NULL),
('kamal bhodekar', '7418529631', 'kamal@bhodekar.parsoda', 'Hyderabad', 'finance', 'male', '789456123456', 'free', 'WhatsApp', 'at post  parsoda', NULL, NULL, NULL),
('krishana bankar', '8516956613', 'krishnabankar62@gmail.com', 'Hyderabad', 'human resource', 'other', '124664644789', 'paid', 'Mail', 'MH F,\r\nUnivresity Of Hyderabad', NULL, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `blog`
--
ALTER TABLE `blog`
  ADD PRIMARY KEY (`sno`);

--
-- Indexes for table `email_subscription`
--
ALTER TABLE `email_subscription`
  ADD PRIMARY KEY (`s_no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `blog`
--
ALTER TABLE `blog`
  MODIFY `sno` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `email_subscription`
--
ALTER TABLE `email_subscription`
  MODIFY `s_no` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
