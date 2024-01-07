-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 07, 2024 at 12:14 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aplikasigudang`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id_barang` varchar(10) NOT NULL,
  `nm_barang` varchar(100) NOT NULL,
  `nm_jenis` varchar(100) NOT NULL,
  `nm_merek` varchar(100) NOT NULL,
  `nm_supplier` varchar(100) NOT NULL,
  `hrg_barang` int(20) NOT NULL,
  `stok_barang` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id_barang`, `nm_barang`, `nm_jenis`, `nm_merek`, `nm_supplier`, `hrg_barang`, `stok_barang`) VALUES
('BRG0001', 'Aspire E 14', 'Leptop', 'Acer', 'Acer Inc.', 8000000, 1),
('BRG0002', 'Aspire E 15', 'Leptop', 'Acer', 'Acer Inc.', 12000000, 1),
('BRG0003', 'Aspire E 16', 'Leptop', 'Acer', 'Acer Inc.', 11000000, 1);

-- --------------------------------------------------------

--
-- Table structure for table `brng_keluar`
--

CREATE TABLE `brng_keluar` (
  `id_keluar` varchar(10) NOT NULL,
  `tgl_keluar` date NOT NULL,
  `nm_barang` varchar(100) NOT NULL,
  `stok_keluar` int(20) NOT NULL,
  `nm_user` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `brng_keluar`
--

INSERT INTO `brng_keluar` (`id_keluar`, `tgl_keluar`, `nm_barang`, `stok_keluar`, `nm_user`) VALUES
('KLR0001', '2024-01-07', 'Aspire E 14', 2, 'Ridho');

-- --------------------------------------------------------

--
-- Table structure for table `brng_masuk`
--

CREATE TABLE `brng_masuk` (
  `id_masuk` varchar(10) NOT NULL,
  `tgl_masuk` date NOT NULL,
  `nm_barang` varchar(100) NOT NULL,
  `stok_masuk` int(20) NOT NULL,
  `nm_supplier` varchar(100) NOT NULL,
  `nm_user` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `brng_masuk`
--

INSERT INTO `brng_masuk` (`id_masuk`, `tgl_masuk`, `nm_barang`, `stok_masuk`, `nm_supplier`, `nm_user`) VALUES
('MSK0001', '2024-01-07', 'Aspire E 14', 3, 'Acer Inc.', 'Ridho'),
('MSK0002', '2024-01-07', 'Aspire E 15', 3, 'Acer Inc.', 'Ridho');

-- --------------------------------------------------------

--
-- Table structure for table `jns_barang`
--

CREATE TABLE `jns_barang` (
  `id_jenis` varchar(10) NOT NULL,
  `nm_jenis` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jns_barang`
--

INSERT INTO `jns_barang` (`id_jenis`, `nm_jenis`) VALUES
('JEN0001', 'Leptop'),
('JEN0002', 'Monitor'),
('JEN0003', 'RAM');

-- --------------------------------------------------------

--
-- Table structure for table `mrk_barang`
--

CREATE TABLE `mrk_barang` (
  `id_merek` varchar(10) NOT NULL,
  `nm_merek` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mrk_barang`
--

INSERT INTO `mrk_barang` (`id_merek`, `nm_merek`) VALUES
('MER0001', 'Acer'),
('MER0002', 'Asus'),
('MER0003', 'Samsung');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id_supplier` varchar(10) NOT NULL,
  `nm_supplier` varchar(100) NOT NULL,
  `nohp_supplier` varchar(12) NOT NULL,
  `alamat_supplier` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id_supplier`, `nm_supplier`, `nohp_supplier`, `alamat_supplier`) VALUES
('SUP0001', 'Acer Inc.', '081234567890', 'jakarta Selaran'),
('SUP0002', 'AsusTek Computer Inc.', '082209876543', 'Jakarta Utara'),
('SUP0003', 'Samsung Inc', '0975323583', 'jakarta barat');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` varchar(10) NOT NULL,
  `lvl_user` varchar(10) NOT NULL,
  `nm_user` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `nohp_user` varchar(12) NOT NULL,
  `alamat_user` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `lvl_user`, `nm_user`, `username`, `password`, `nohp_user`, `alamat_user`) VALUES
('USER01', 'Staff', 'Muzaki', 'staff', 'staff', '081234567890', 'Banjarbaru'),
('USER02', 'Admin', 'Ridho', 'admin', 'admin', '082212345678', 'Astambul');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `brng_keluar`
--
ALTER TABLE `brng_keluar`
  ADD PRIMARY KEY (`id_keluar`);

--
-- Indexes for table `brng_masuk`
--
ALTER TABLE `brng_masuk`
  ADD PRIMARY KEY (`id_masuk`);

--
-- Indexes for table `jns_barang`
--
ALTER TABLE `jns_barang`
  ADD PRIMARY KEY (`id_jenis`);

--
-- Indexes for table `mrk_barang`
--
ALTER TABLE `mrk_barang`
  ADD PRIMARY KEY (`id_merek`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_supplier`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
