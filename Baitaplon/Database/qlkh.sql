-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 31, 2024 lúc 06:06 PM
-- Phiên bản máy phục vụ: 10.4.28-MariaDB
-- Phiên bản PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlkh`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `customers`
--

CREATE TABLE `customers` (
  `customer_id` int(11) NOT NULL,
  `fullname` varchar(50) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `total_amount` bigint(20) DEFAULT NULL,
  `phanhang` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `customers`
--

INSERT INTO `customers` (`customer_id`, `fullname`, `gender`, `email`, `phone`, `address`, `total_amount`, `phanhang`) VALUES
(1, 'Nguyễn Văn A', 'Nam', 'nguyenvana@example.com', '0123456789', '123 Đường Láng, Hà Nội', 10000000, 'Thành viên Vàng'),
(2, 'Trần Thị B', 'Nữ', 'tranthib@example.com', '0987654321', '456 Đường Bưởi, Hà Nội', 54000000002873450, 'Thành viên Kim cương'),
(3, 'Lê Văn C', 'Nam', 'levanc@example.com', '0901234567', '789 Đường Giải Phóng, Hà Nội', 850000, 'Thành viên'),
(4, 'Pham Thi D', 'Nữ', 'phamthid@example.com', '0987654320', '123 Đường JKL, Hải Phòng', 50040000, 'Thành viên Kim cương'),
(5, 'Hoang Van E', 'Nam', 'hoangvane@example.com', '0123456787', '456 Đường MNO, Cần Thơ', 3000000, 'Thành viên Bạc'),
(6, 'Vo Thi F', 'Nữ', 'vothif@example.com', '0987654319', '789 Đường PQR, Bình Dương', 75000000, 'Thành viên Kim cương'),
(7, 'Do Van G', 'Nam', 'dovang@example.com', '0123456786', '123 Đường STU, Biên Hòa', 2000000, 'Thành viên'),
(8, 'Ngo Thi H', 'Nữ', 'ngothih@example.com', '0987654318', '456 Đường VWX, Vũng Tàu', 9004, 'Thành viên'),
(9, 'Vu Van I', 'Nam', 'vuvani@example.com', '0123456785', '789 Đường YZA, Hà Nội', 5000, 'Thành viên'),
(10, 'Nguyen Thi J', 'Nữ', 'nguyenthij@example.com', '0987654317', '123 Đường BCD, TP HCM', 8250, 'Thành viên');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `orders`
--

CREATE TABLE `orders` (
  `order_id` int(11) NOT NULL,
  `order_name` varchar(50) DEFAULT NULL,
  `order_quantity` int(11) DEFAULT NULL,
  `order_date` varchar(50) DEFAULT NULL,
  `order_price` bigint(20) DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `customer_name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `orders`
--

INSERT INTO `orders` (`order_id`, `order_name`, `order_quantity`, `order_date`, `order_price`, `customer_id`, `customer_name`) VALUES
(1, 'Mì tôm', 5, '2023-05-01', 150000, NULL, 'Lê Văn C'),
(2, 'Sản phẩm', 5, '2023-05-03', 100000, NULL, 'Trần Thị B'),
(3, 'A', 6, '2023-05-05', 9000000000000000, NULL, 'Trần Thị B'),
(4, '1', 10, '1', 12345, NULL, 'Trần Thị B'),
(5, 'Order 1', 2, '2024-01-01', 5000000, NULL, 'Pham Thi D'),
(6, 'Order 2', 3, '2024-01-02', 750000, NULL, 'Trần Thị B'),
(7, 'Order 3', 1, '2024-01-03', 100000, NULL, 'Lê Văn C'),
(8, 'Order 4', 4, '2024-01-04', 12510000, NULL, 'Pham Thi D'),
(9, 'Order 5', 2, '2024-01-05', 1500000, NULL, 'Hoang Van E'),
(10, 'Order 6', 3, '2024-01-06', 25000000, NULL, 'Vo Thi F'),
(11, 'Order 7', 1, '2024-01-07', 2000000, NULL, 'Do Van G'),
(12, 'Order 8', 4, '2024-01-08', 2251, NULL, 'Ngo Thi H'),
(13, 'Order 9', 2, '2024-01-09', 2500, NULL, 'Vu Van I'),
(14, 'Order 10', 3, '2024-01-10', 2750, NULL, 'Nguyen Thi J');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `quyen` int(1) NOT NULL,
  `sdt` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`id`, `username`, `fullname`, `password`, `quyen`, `sdt`) VALUES
(1, 'admin', 'Admin', 'admin', 0, '0123'),
(2, 'nmt', 'Nguyễn Minh Thuận', '1', 1, '234');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`customer_id`);

--
-- Chỉ mục cho bảng `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`order_id`),
  ADD KEY `customer_id` (`customer_id`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `customers`
--
ALTER TABLE `customers`
  MODIFY `customer_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `orders`
--
ALTER TABLE `orders`
  MODIFY `order_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`customer_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
