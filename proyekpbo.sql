-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 01, 2023 at 06:03 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `proyekpbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `nim` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `kelas` varchar(10) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `email` varchar(50) NOT NULL,
  `tlpn` varchar(50) NOT NULL,
  `tempat_lahir` varchar(50) NOT NULL,
  `tanggal_lahir` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`nim`, `nama`, `kelas`, `alamat`, `email`, `tlpn`, `tempat_lahir`, `tanggal_lahir`) VALUES
('112111905', 'Annisa Fitriani', '2D32', 'Jl. Jafri Zam Zam Komp. Grawiratama II RT. 39/RW. 03', '112111905@stis.ac.id', '081251067009', 'Malang', '2003-12-01'),
('112112020', 'Endang Sulistia', '2D35', 'Jorong, desa sikur, kec. sikur, Lombok Timur ', '112112020@stis.ac.id', '085921487185', 'Jorong ', '2002-10-22'),
('112112209', 'Muhammad Bagus Yudistira', '2D32', 'Jl Budi waluyo no 66 RT 006/RW ', '112112209@stis.ac.id', '082149921667', 'Banjarbaru', '2003-10-05'),
('112112356', 'Selina Ansila Perita Parus', '2D34', 'Golowelu, RT. 03/RW. 02', '112112356@stis.ac.id', '081310339928', 'Cancar, Manggarai', '2001-12-21'),
('212111847', 'Adrian Kesar Pratama Lubis', '2ST3', 'Jalan Kebon Nanas Selatan I No.31, RT.8/RW.8, Kel. Cipinang Cempedak, Jatinegara, Kota Jakarta Timur, DKI Jakarta.', '212111847@stis.ac.id', '085763416405', 'Sinaman II', '2000-10-06'),
('212212457', 'Agustin Kurniasari', '1ST2', 'Jalan Kebon Sayur I No. 3, Rt. 10/03', '212212457@stis.ac.id', '087885168105', 'Klaten', '2004-08-31'),
('212212529', 'Az Zikri Reza Pahlevi', '1ST3', 'JL.OTISTA 2, RT 7/RW 9', '212212529@stis.ac.id', '08995741634', 'Bandarlampung', '2004-05-18'),
('212212579', 'Elfira Elsa Damayanti', '1ST7', 'Jalan Kebon Sayur I No 3, RT 10 RW 3', '212212579@stis.ac.id', '082323260029', 'Sragen', '2004-04-10'),
('212212645 ', 'Hikmal Mardian Irianto ', '1ST2', 'Jalan Kebun Sayur 1 RT003/015 No 19', '212212645@stis.ac.id', '081775423244', 'Temanggung', '2003-03-24'),
('212212733', 'Miranda Aulia', '1ST6', 'Jalan Kebon Nanas Selatan 2 No.3 RT.03/RW.08', '212212733@stis.ac.id', '08999068048', 'Bandarlampung', '2004-11-23'),
('212212763', 'Muhammad Rafa Arianto ', '1ST2', ' Jalan Otista 3 No. 19A, RT.2/RW.4', '212212763@stis.ac.id', '081268719293', 'Pekanbaru', '2004-04-04'),
('212212805', 'Nugroho Tesla Arianto ', '1ST2', ' Jalan Kebon Sayur 1 No 12, RT 8 RW 15', '212212805@stis.ac.id', '085601270247', 'Purworejo', '2003-01-11'),
('212212845', 'Reynadi Wisnu Wardana', '1ST3', 'Gang Mangga No.20, RT.1/RW.3, Kelurahan Bidaracina, Jatinegara', '212212845@stis.ac.id', '081539370149', 'Pangkalpinang', '2004-10-08'),
('212212861', 'Rokhmirati Prasetyo', '1ST2', 'Jl. Kebon Nanas Selatan 2 No.3 RT.03/RW.08 Kelurahan Cipinang Cempedak Kec.Jatinegara, Jakarta Timur (Depan Mie Ayam Babe), KOTA JAKARTA TIMUR, JATINEGARA, DKI JAKARTA, ID, 13340', '212212861@stis.ac.id', '088214825411', 'Magelang', '2003-12-19'),
('212212890', 'Sun Asi Gabriella S.', '1ST3', 'Jl. Kebon Nanas Selatan 2 No.3 RT.03/RW.08 Kelurahan Cipinang Cempedak Kec.Jatinegara, Jakarta Timur (Depan Mie Ayam Babe), KOTA JAKARTA TIMUR, JATINEGARA, DKI JAKARTA, ID, 13340', '212212890@stis.ac.id', '08991139541', 'Palangka Raya', '2004-01-29'),
('222111877', 'Almira Utami', '2KS6', 'Jalan Suka Tani No.06, Simpang Mangga Bawah, Rantauprapat', '222111877@stis.ac.id', '085270197067', 'Rantauprapat', '2002-07-08'),
('222111893', 'Andika Rahmat Saidudin', '2KS6', 'Jl. Kedungsari RT1 RW1, Kota Mojokerto', '222111893@stis.ac.id', '0895331138629', 'Mojokerto', '2002-05-03');

-- --------------------------------------------------------

--
-- Table structure for table `pendaftar`
--

CREATE TABLE `pendaftar` (
  `nama_kegiatan` varchar(50) NOT NULL,
  `nim` varchar(100) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jeniskelamin` varchar(10) NOT NULL,
  `tingkat` int(10) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `tlpn` varchar(50) NOT NULL,
  `ttl` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pendaftar`
--

INSERT INTO `pendaftar` (`nama_kegiatan`, `nim`, `nama`, `jeniskelamin`, `tingkat`, `alamat`, `email`, `tlpn`, `ttl`) VALUES
('PDT (Pembangunan Desa Tertinggal)', '112111951', 'Baiq Qonita Firjatullah', 'Perempuan', 2, 'Jalan Gili Air 1 Nomor 13 Kel. Taman Sari RT. 002/RW. 029, Kec. Ampenan, Kota Mataram, Prov NTB', '112111951@stis.ac.id', '081907147099', '2002-09-12'),
('Pelatihan Internal Renang', '112112002', 'Dyah Puspitasari ', 'Perempuan', 2, 'Jl Kebon Sayur I, No 12A, RT/RW 003/015', '112112002@stis.ac.id', '081240544263', '2004-02-20'),
('Pelatihan Internal Renang', '112212908', 'Vhania Mutiara Sinaga', 'Perempuan', 1, 'Jl. Sensus I, No.8b', '112212908@stis.ac.id', '081369720493', '2002-11-01'),
('Pendakian Umum', '212111965', 'Celvin Keyla Alidra ', 'Laki-Laki', 2, 'Jl.Kebon Nanas Selatan II No.10 RT5/RW5, Cipinang Cempedak, Jatinegara, Jakarta Timur', '212111965@stis.ac.id', '088233094155', '2003-02-26'),
('Pelatihan Internal RC', '212112216', 'Muhammad Ilzam Falahuddin', 'Laki-Laki', 2, 'Jalan Otista II, Gang H. And Rahman No.34 RT.9/RW.03 ', '212112216@stis.ac.id', '081331907875', '2002-03-25'),
('Pendakian Umum', '212112318', 'Ricky Ardiyansah Saputra', 'Laki-Laki', 2, 'Jalan Dewi Kunti I Grogol, RT 10 RW 04, Dukuh, Sidomukti, Salatiga, Jawa Tengah', '212112318@stis.ac.id', '085747592785', '2000-11-20'),
('Pelatihan Internal Renang', '212212479', 'Alif Hidayah Nur Rahmadani', 'Perempuan', 1, 'Jalan Kebon Nanas Selatan II, No. 3, RT 03 RW 08', '212212479@stis.ac.id', '082134256125', '2001-12-10'),
('Pendakian Umum', '212212506', 'Anjelita Nabila Putri', 'Perempuan', 1, 'Jalan Haji Hasbi RT9/RW9, nomor 22A', '212212506@stis.ac.id', '0895344410313', '2003-07-09'),
('Pelatihan Internal Renang', '212212535', 'Berlian Bagus Antonia', 'Perempuan', 1, 'Jalan Kebon Sayur 1, No 8, RT 06 / RW 15', '212212535@stis.ac.id', '083848728990', '2003-09-28'),
('Pendakian Umum', '212212669', 'Iqbal Maulana', 'Laki-Laki', 1, 'Jalan. Kebon Nanas Selatan 1, Rt.16/Rw.8/No.10', '212212669@stis.ac.id', '082361711323', '2003-07-30'),
('Pendakian Umum', '212212774', 'Muhammad Zacky Arie Pratama', 'Laki-Laki', 1, 'jalan kebon Nanas Selatan II RT5/RW5', '212212774@stis.ac.id', '082271281166', '2004-04-12'),
('Pelatihan Internal Renang', '212212799', 'Nisriinaa Najlaa Jevon', 'Perempuan', 1, 'Jalan Kebun Sayur No.5, RT.6/RW.15', '212212799@stis.ac.id', '083834206587', '2004-06-03'),
('Pendakian Umum', '212212806', 'Nur Faqih Ihsan', 'Laki-Laki', 1, 'Jl. Saabun No.31, RT.14/RW.2, Bidara Cina', '212212806@stis.ac.id', '08980100830', '2003-11-08'),
('Pelatihan Internal Renang', '212212912', 'Wahyuningtyas Yudha Sarjani', 'Perempuan', 1, 'Jalan Kebun Sayur 1 No.7, RT.3/RW.15', '212212912@stis.ac.id', '085229672800', '2003-12-05'),
('Pelatihan Internal Renang', '222111843', 'Adinda Ayu Pramesthi', 'Perempuan', 2, 'Jl. Masjid No 23B', '222111843@stis.ac.id', '085123456789', '2002-04-23'),
('PDT (Pembangunan Desa Tertinggal)', '222111933', 'Aulia Azzahra', 'Perempuan', 2, 'Gang Abdurrahman No 34A', '222111933@stis.ac.id', '081237770333', '2003-01-14'),
('Pelatihan Internal RC', '222112227', 'Mukhamad Dinda Manis Yulianto', 'Laki-Laki', 2, 'Jl. Pedati 11A RT 2, RW 1', '222112227@stis.ac.id', '0895616754979', '2003-07-03'),
('Pendakian Umum', '222112354', 'Satrio Putyo Danendra', 'Laki-Laki', 2, 'Jl. H. Yahya 45 RT 014/RW 010', '222112354@stis.ac.id', '08977444754', '2002-12-13'),
('PDT (Pembangunan Desa Tertinggal)', '222112379', 'Sri Nurmala Ningsih', 'Perempuan', 2, 'Jl Masjid No 32 RT 14, RW 09', '222112379@stis.ac.id', '087840662691', '2002-05-05'),
('PDT (Pembangunan Desa Tertinggal)', '222212447', 'Aditya Hari Kurnia Putra', 'Laki-Laki', 1, 'Jalan Kebon Nanas Utara 2 No.20, RT.1/RW.7', '222212447@stis.ac.id', '081368747535', '2002-11-01'),
('Pendakian Umum', '222212865', 'Sabastian Alfons Bahy', 'Laki-Laki', 1, 'Jalan Kebon Sayur 1 RT4/RW3', '222212865@stis.ac.id', '082266700395', '2003-04-12'),
('Pelatihan Internal RC', '222212916', 'Willy Sumbayak ', 'Laki-Laki', 1, 'Jalan Kebon Nanas II RT1/RW', '222212916@stis.ac.id', '082275236668', '2005-08-05');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `pass` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `email`, `pass`) VALUES
(1, 'admin1', 'admin111');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `pendaftar`
--
ALTER TABLE `pendaftar`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
