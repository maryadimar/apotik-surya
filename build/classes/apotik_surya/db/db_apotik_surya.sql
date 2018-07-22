-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 22, 2018 at 10:54 PM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_apotik_surya`
--

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE IF NOT EXISTS `obat` (
  `kdobat` varchar(90) NOT NULL,
  `nmobat` varchar(90) NOT NULL,
  `jnsobat` varchar(90) NOT NULL,
  `hrgobat` double NOT NULL,
  `stok` int(11) NOT NULL,
  PRIMARY KEY (`kdobat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`kdobat`, `nmobat`, `jnsobat`, `hrgobat`, `stok`) VALUES
('OBT001', 'liberat 200mg', 'OBAT RINGAN', 2600, 118),
('OBT002', 'bisoprolol 5mg', 'OBAT SEDANG', 3300, 100),
('OBT003', 'achitromichin 500mg', 'OBAT RINGAN', 12000, 80);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE IF NOT EXISTS `transaksi` (
  `idtrans` varchar(90) NOT NULL,
  `tgltrans` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `kdobat` varchar(90) NOT NULL,
  `jmlbeli` int(11) NOT NULL,
  `total` double NOT NULL,
  `diskon` double NOT NULL,
  `totalbayar` double NOT NULL,
  PRIMARY KEY (`idtrans`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`idtrans`, `tgltrans`, `kdobat`, `jmlbeli`, `total`, `diskon`, `totalbayar`) VALUES
('TR001', '2018-07-11 00:00:00', 'OBT001', 2, 5200, 1040, 4160);
