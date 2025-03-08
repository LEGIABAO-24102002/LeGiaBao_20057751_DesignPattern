# Tính toán Thu Nhập Nhân Viên với Các Design Pattern

Dự án này trình bày cách tính thu nhập cho nhân viên trong một tổ chức. Thu nhập của nhân viên được tính dựa trên:
- **Lương cơ bản cố định**
- **Phụ cấp** theo chức vụ (ví dụ: phụ cấp Tiến sĩ, phụ cấp Trưởng khoa, phụ cấp Tổ trưởng, phụ cấp Trưởng phòng, ...)

Mỗi giải pháp triển khai được thực hiện theo một cách tiếp cận khác nhau:
- **No Design Pattern**
- **State Pattern**
- **Decorator Pattern**
- **Strategy Pattern**

## 1. No Design Pattern

**Mô tả:**  
Sử dụng các cấu trúc điều kiện (switch-case) để xác định phụ cấp dựa trên chức vụ của nhân viên.

**Ưu điểm:**  
- Dễ hiểu và triển khai nhanh chóng cho hệ thống nhỏ.

**Nhược điểm:**  
- Khó mở rộng khi số lượng chức vụ tăng lên.
- Vi phạm nguyên tắc **Open/Closed** (mở rộng khó, sửa đổi nhiều).

**Khi nào sử dụng:**  
Phù hợp với các bài toán nhỏ, số lượng chức vụ hạn chế.

---

## 2. State Pattern

**Mô tả:**  
Mỗi chức vụ được mô hình hóa như một trạng thái riêng biệt thông qua interface `Position`. Mỗi lớp cài đặt interface này sẽ định nghĩa phương thức lấy phụ cấp và tên chức vụ riêng.

**Ưu điểm:**  
- Mở rộng dễ dàng khi thêm chức vụ mới mà không cần thay đổi code hiện có.
- Phân tách rõ ràng logic theo từng trạng thái (chức vụ).

**Nhược điểm:**  
- Tạo ra nhiều lớp riêng cho mỗi trạng thái, có thể làm tăng độ phức tạp của hệ thống đối với bài toán nhỏ.

**Khi nào sử dụng:**  
Khi mỗi chức vụ có các hành vi riêng biệt và có thể phát sinh logic phụ trợ khác.

---

## 3. Decorator Pattern

**Mô tả:**  
Sử dụng pattern Decorator để “bọc” đối tượng `Employee` nhằm mở rộng thêm tính năng tính toán phụ cấp mà không làm thay đổi cấu trúc ban đầu của lớp.

**Ưu điểm:**  
- Linh hoạt trong việc kết hợp nhiều phụ cấp.
- Cho phép mở rộng tính năng cho đối tượng một cách động.

**Nhược điểm:**  
- Cấu trúc phức tạp hơn, đặc biệt khi có nhiều lớp decorator liên tiếp.
- Khó truy xuất thông tin chi tiết khi có nhiều decorator chồng lên nhau.

**Khi nào sử dụng:**  
Khi nhân viên có thể có nhiều phụ cấp được áp dụng đồng thời và cần tính linh động cao.

---

## 4. Strategy Pattern

**Mô tả:**  
Tách riêng logic tính lương thành các chiến lược riêng biệt thông qua giao diện `SalaryStrategy`. Mỗi chiến lược cụ thể tương ứng với một chức vụ và có cách tính phụ cấp khác nhau.

**Ưu điểm:**  
- Cấu trúc rõ ràng, tách biệt logic tính lương khỏi lớp `Employee`.
- Dễ bảo trì, mở rộng và thay đổi chiến lược tính lương một cách linh hoạt.

**Nhược điểm:**  
- Yêu cầu tạo ra nhiều lớp chiến lược riêng biệt.

**Khi nào sử dụng:**  
Khi logic tính lương có khả năng thay đổi theo thời gian hoặc cần tính linh hoạt cao trong việc lựa chọn chiến lược.

---

## Kết Luận

Trong bài toán này, nếu dự án của bạn có tiềm năng mở rộng với nhiều thay đổi về cách tính lương và phụ cấp, **Strategy Pattern** thường là cách giải tốt nhất. Nó cho phép thay đổi chiến lược tính lương một cách độc lập mà không ảnh hưởng đến cấu trúc đối tượng `Employee`.
