-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 26, 2018 at 06:37 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_sysbook`
--
CREATE DATABASE IF NOT EXISTS `db_sysbook` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `db_sysbook`;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_buku`
--

CREATE TABLE `tbl_buku` (
  `buk_id` bigint(255) NOT NULL,
  `buk_kode` varchar(5) NOT NULL,
  `buk_judul` varchar(150) NOT NULL,
  `buk_tahun` int(4) NOT NULL,
  `buk_penulis` varchar(150) NOT NULL,
  `buk_penerbit` varchar(150) NOT NULL,
  `buk_stok` int(10) NOT NULL,
  `buk_jenis` enum('Hard Back','Paper Back') NOT NULL,
  `buk_harga` bigint(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_buku`
--

INSERT INTO `tbl_buku` (`buk_id`, `buk_kode`, `buk_judul`, `buk_tahun`, `buk_penulis`, `buk_penerbit`, `buk_stok`, `buk_jenis`, `buk_harga`) VALUES
(1, 'J23I4', 'Ilmu Pengetahuan Alam', 2010, 'Ahmad Suryono', 'Erlangga', 9, 'Paper Back', 1000),
(3, 'DEVE2', 'input judul', 2013, 'input penulis', 'input cok', 10, 'Hard Back', 1000),
(5, 'DEVE1', 'input judul', 2013, 'input penulis', 'input penerbit', 10, 'Hard Back', 1000),
(6, 'DEVE0', 'input judul', 2013, 'input penulis', 'input update', 10, 'Hard Back', 1000);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_sewa`
--

CREATE TABLE `tbl_sewa` (
  `sew_id` bigint(255) NOT NULL,
  `buk_id` bigint(255) NOT NULL,
  `sew_nama` varchar(20) NOT NULL,
  `sew_lamaPeminjaman` int(2) NOT NULL,
  `sew_tanggalPinjam` int(10) NOT NULL,
  `sew_tanggalKembali` int(10) NOT NULL,
  `sew_totalHarga` bigint(13) NOT NULL,
  `sew_denda` bigint(13) NOT NULL,
  `sew_status` enum('Pinjam','Kembali') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_sewa`
--

INSERT INTO `tbl_sewa` (`sew_id`, `buk_id`, `sew_nama`, `sew_lamaPeminjaman`, `sew_tanggalPinjam`, `sew_tanggalKembali`, `sew_totalHarga`, `sew_denda`, `sew_status`) VALUES
(1, 3, 'Wiguna', 1, 1543084875, 1542890800, 3000, 6000, 'Kembali'),
(2, 1, 'Wiguna', 2, 1543084875, 1543171275, 3000, 0, 'Kembali'),
(3, 3, 'denda', 1, 1543084919, 1543171319, -1000, 0, 'Kembali'),
(4, 1, 'denda', -2, 1543084919, 1543171319, -1000, 0, 'Kembali'),
(5, 1, 'test', 1, 1543088396, 1543174796, 1000, 0, 'Pinjam'),
(8, 1, 'Wign', 2, 1543091941, 1543178341, 2000, 0, 'Pinjam'),
(10, 1, 'stok', 1, 1543169849, 1543256249, 1000, 0, 'Pinjam'),
(11, 3, 'test', 1, 1543170086, 1543256486, 1000, 0, 'Pinjam'),
(12, 1, 'test', 1, 1543170086, 1543256486, 1000, 0, 'Pinjam');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_users`
--

CREATE TABLE `tbl_users` (
  `usr_id` int(10) NOT NULL,
  `usr_username` varchar(20) NOT NULL,
  `usr_password` varchar(64) NOT NULL,
  `usr_role` enum('Admin','Kasir') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_users`
--

INSERT INTO `tbl_users` (`usr_id`, `usr_username`, `usr_password`, `usr_role`) VALUES
(1, 'admin', '8C6976E5B5410415BDE908BD4DEE15DFB167A9C873FC4BB8A81F6F2AB448A918', 'Admin'),
(2, 'kasir1', '99a2e0a8f6b24488d3f0fdb4b6714716099bcdf372de052ba620e2ff4312ee8f', 'Kasir'),
(3, 'test', '681861b01f0d0dc6ea0b82dd4f1e92fcf7f6707c978830a07c75a1efd95b52b8', 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_buku`
--
ALTER TABLE `tbl_buku`
  ADD PRIMARY KEY (`buk_id`);

--
-- Indexes for table `tbl_sewa`
--
ALTER TABLE `tbl_sewa`
  ADD PRIMARY KEY (`sew_id`),
  ADD KEY `buk_id` (`buk_id`);

--
-- Indexes for table `tbl_users`
--
ALTER TABLE `tbl_users`
  ADD PRIMARY KEY (`usr_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_buku`
--
ALTER TABLE `tbl_buku`
  MODIFY `buk_id` bigint(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_sewa`
--
ALTER TABLE `tbl_sewa`
  MODIFY `sew_id` bigint(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `tbl_users`
--
ALTER TABLE `tbl_users`
  MODIFY `usr_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_sewa`
--
ALTER TABLE `tbl_sewa`
  ADD CONSTRAINT `tbl_sewa_ibfk_1` FOREIGN KEY (`buk_id`) REFERENCES `tbl_buku` (`buk_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
