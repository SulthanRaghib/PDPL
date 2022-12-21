## Soal 1

Perhatikan implementasi pola proxy berikut,

<img src="img/soal-1.png">

Jika terdapat perubahan requirement untuk menambahkan beberapa situs yang perlu diblacklist, perubahan kode akan terjadi pada kelas apa saja?

a. Perubahan pada kelas RealInternet dan interface internet <br>
b. Perubahan pada kelas ProxyInternet saja ✅ <br>
c. Perubahan pada kelas ProxyInternet dan Client <br>
d. Perubahan pada kelas RealInternet saja 

## Soal 2

Perhatikan implementasi pola proxy berikut, jika pada kelas ProxyInternet, variabel list bannedSItes ditambahkan item (bannedSites.add("nurulfikri.ac.id"); 

<img src="img/soal-2.png">

maka output dari kelas client berikut adalah...

<img src="img/soal-2.2.png">

a. Connecting to nurulfikri.ac.id <br>
   Access Denied <br>
b. Access Denied <br>
   Connecting to abc.com <br>
c. Error, exceeded character <br>
d. Access Denied ✅ <br>
   Access Denied <br>
