
#Praktikum 10 


#Penjelasan tentang menambahkan fitur ubah pin dan validasi saldo minimal  


--> import com.atm.model.Account = mengimpor class Account dari package com.atm.model.
--> import com.atm.transaction.* = mengimpor semua class pada package com.atm.transaction.*.
--> import java.util.HashMap = mengimpor class java untuk menyimpan data.
--> import java.util.Map = mengimpor class java untuk mendifinisikan struktur data. 
--> import java.util.Scanner = mengimpor class java untuk melakukan inputan.

#Menambahkan fitur ubah pin
fitur ubah terdapat pada Account.java
Account.java
![image](https://github.com/user-attachments/assets/8bea0060-8a1d-4a56-ae8e-d83823e7e60a)
![image](https://github.com/user-attachments/assets/c08222ec-c0fe-4465-b7d9-cb1ecd0b7d46)

Membuat method baru, yaitu public void changePin untuk ubah PIN dengan verifikasi pin lama, lalu pin baru dua kali untuk konfirmasi pin, 
jika pada konfirmasi salah atau tidak sesuai dengan pin baru maka lakukan konfirmasi ulang, setelah itu login ulang dengan memasukkan nomor akun dan pin baru.
Hasilnya:

![image](https://github.com/user-attachments/assets/6de2203d-4a4d-4ada-8020-a9a68cf38ca1)

#Validasi saldo minimal
validasi saldo minimal dengan minimal saldo Rp. 50.000 terdapat Withdrawal.java
Withdrawal.java
![image](https://github.com/user-attachments/assets/4686fb78-ae9b-4866-a2e2-c5d224d25007)

jika saldo 50.000 tidak bisa melakukan penarikan, karena minimal saldo 50.000 maka jika ingin melakukan penarikan saldo 
harus lebih dari 50.000 bisa melakukan penarikan. Apabila penarikan (jumlah saldo - input yang ingin ditarik) kurang dari 50.000
maka penarikan batal dan mesin menampilkan pesan ("Saldo tidak mencukupi untuk penarikan dengan saldo minimal Rp50,000.").
hasilnya: 

![image](https://github.com/user-attachments/assets/354e699f-7e40-4e92-94e5-c5d0a98de7ae)

Dengan menambahkan fitur ubah pin dan validasi saldo minimal maka ada penambahan case pada method showMenu di public class ATM
ATM.java
![image](https://github.com/user-attachments/assets/2b4f6c2f-3777-4635-9350-b01152de39ff)
![image](https://github.com/user-attachments/assets/04c59d3e-a5fb-4e44-8ec2-344d5baac538)
![image](https://github.com/user-attachments/assets/bd5af902-5e25-48f7-87dc-96ff452c3d47)


#Screenshot seluruh code
Account.java

![image](https://github.com/user-attachments/assets/8bea0060-8a1d-4a56-ae8e-d83823e7e60a)
![image](https://github.com/user-attachments/assets/c08222ec-c0fe-4465-b7d9-cb1ecd0b7d46)


Deposit.java

![image](https://github.com/user-attachments/assets/9806f984-260f-4184-b6b8-678766e4b554)


Transaction.java

![image](https://github.com/user-attachments/assets/f1fe0272-09f5-4ea2-b00a-b841f208c6f8)



Transfer.java

![image](https://github.com/user-attachments/assets/f86a89ec-d9ad-4879-a708-fe91079994a0)


Withdrawal.java
![image](https://github.com/user-attachments/assets/12e49834-9c3f-4be8-aebb-a4b81acefd00)


ATM.java

![image](https://github.com/user-attachments/assets/2b4f6c2f-3777-4635-9350-b01152de39ff)
![image](https://github.com/user-attachments/assets/04c59d3e-a5fb-4e44-8ec2-344d5baac538)
![image](https://github.com/user-attachments/assets/bd5af902-5e25-48f7-87dc-96ff452c3d47)


Main.java

![image](https://github.com/user-attachments/assets/8fb46003-3b89-4537-a5fe-e3520a8f614e)
