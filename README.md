<p align="center">
  <img src="https://media3.giphy.com/media/v1.Y2lkPTc5MGI3NjExMGM2MmJ2OWF6MmE1amttMTF6ZTBlcnN1cXByOXNtMTdxaHJkMmtoaCZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9cw/JwOUH7TbHFHg3LnX18/giphy.gif" width="20%" />
</p>
<p align="center">
    <h1 align="center">Sistem Pencatatan Data Mahasiswa</h1>
</p>
<p align="center">
    <em>Website Sistem Pencatatan Data Mahasiswa (Buku Tamu Digital) Berbasis Springboot</em>
</p>
<p align="center">
	<img src="https://img.shields.io/github/license/dazidhan/ManajemenData?style=flat-square&logo=opensourceinitiative&logoColor=white&color=009688" alt="license">
	<img src="https://img.shields.io/github/last-commit/dazidhan/ManajemenData?style=flat-square&logo=git&logoColor=white&color=009688" alt="last-commit">
	<img src="https://img.shields.io/github/languages/top/dazidhan/ManajemenData?style=flat-square&color=009688" alt="repo-top-language">
	<img src="https://img.shields.io/github/languages/count/dazidhan/ManajemenData?style=flat-square&color=009688" alt="repo-language-count">
</p>
<p align="center">
		<em>_Built with:_</em>
</p>
<p align="center">
	<img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat-square&logo=spring-boot&logoColor=white" alt="Spring Boot">
	<img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=java&logoColor=white" alt="Java">
	<img src="https://img.shields.io/badge/Thymeleaf-005F0F?style=flat-square&logo=thymeleaf&logoColor=white" alt="Thymeleaf">
	<img src="https://img.shields.io/badge/MySQL-4479A1?style=flat-square&logo=mysql&logoColor=white" alt="MySQL">
	<img src="https://img.shields.io/badge/Bootstrap-7952B3?style=flat-square&logo=bootstrap&logoColor=white" alt="Bootstrap">
	<img src="https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apache-maven&logoColor=white" alt="Maven">
</p>
<br>

## Table of Contents

1. [Overview](#overview)
2. [Features](#features)
3. [Project Structure](#project-structure)
  3.1. [Project Index](#project-index)
4. [Collaborators](#-collaborators)
   
---

## Overview

**Sistem Pencatatan Data Mahasiswa** adalah aplikasi web berbasis Spring Boot yang dirancang untuk mengelola data mahasiswa dan berfungsi sebagai buku tamu digital. Website ini memungkinkan pengguna untuk menambah, melihat, mengedit, dan menghapus data mahasiswa atau tamu dengan mudah melalui antarmuka web yang intuitif

---

## Features

| | Feature | Summary |
| :--- | :---: | :--- |
| ⚙️ | **Architecture** | <ul><li>Menggunakan arsitektur Model-View-Controller (MVC) dengan Spring Boot</li><li>Integrasi dengan Spring Data JPA untuk persistensi data ke database MySQL</li><li>Menggunakan Thymeleaf sebagai template engine untuk tampilan web</li></ul> |
| 🔩 | **Data Management** | <ul><li>**CRUD Operations**: Mendukung operasi Create, Read, Update, dan Delete (CRUD) untuk data mahasiswa/tamu</li><li>**Validasi Data**: Implementasi validasi input menggunakan Jakarta Validation untuk memastikan integritas data</li><li>**Penanganan Exception**: Penanganan exception khusus untuk kasus data tidak ditemukan</li></ul> |
| 📄 | **User Interface** | <ul><li>Antarmuka pengguna yang responsif dan modern menggunakan Bootstrap 5</li><li>Halaman daftar mahasiswa/tamu dengan tabel yang rapi</li><li>Formulir terpisah untuk menambah dan mengedit data</li></ul> |
| 🔌 | **Integrations** | <ul><li>**MySQL Database**: Terhubung dengan database MySQL untuk penyimpanan data</li><li>**Maven**: Mengelola dependensi proyek dan proses build</li></ul> |
| 🧩 | **Modularity** | <ul><li>Struktur proyek yang terorganisir dengan pemisahan jelas antara Controller, Service, Repository, Model, dan Exception</li><li>Antarmuka `IMahasiswaService` untuk abstraksi logika bisnis</li></ul> |
| 🧪 | **Testing** | <ul><li>Dilengkapi dengan unit test dasar untuk konteks aplikasi Spring Boot</li></ul> |
| 🛡️ | **Security** | <ul><li>Meskipun tidak ada fitur otentikasi/otorisasi yang eksplisit dalam kode yang diberikan, aplikasi ini dibangun di atas Spring Boot yang menyediakan fondasi kuat untuk menambahkan fitur keamanan di masa mendatang</li></ul> |

---

## Project Structure

```sh
└── mahasiswa-guestbook-app/
    ├── .gitattributes
    ├── .gitignore
    ├── HELP.md
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    ├── settings.json
    └── src/
        ├── main/
        │   ├── java/
        │   │   └── com/
        │   │       └── example/
        │   │           └── demo/
        │   │               ├── controller/
        │   │               │   └── MahasiswaController.java
        │   │               ├── exception/
        │   │               │   └── MahasiswaNotFoundException.java
        │   │               ├── model/
        │   │               │   └── Mahasiswa.java
        │   │               ├── repository/
        │   │               │   └── MahasiswaRepository.java
        │   │               ├── service/
        │   │               │   ├── IMahasiswaService.java
        │   │               │   └── MahasiswaService.java
        │   │               └── DemoApplication.java
        │   └── resources/
        │       ├── application.properties
        │       ├── static/
        │       │   └── css/
        │       │       └── style.css
        │       └── templates/
        │           ├── add.html
        │           ├── edit.html
        │           └── index.html
        └── test/
            └── java/
                └── com/
                    └── example/
                        └── demo/
                            └── DemoApplicationTests.java
```

### Project Index

<details open>
	<summary><b><code>Sistem Pencatatan Data Mahasiswa Index</code></b></summary>
	<details> <!-- __root__ Submodule -->
		<summary><b>__root__</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='MultipleFiles/pom.xml'>pom.xml</a></b></td>
				<td>- File konfigurasi Maven yang mendefinisikan dependensi proyek (Spring Boot, Thymeleaf, Spring Data JPA, MySQL Driver, Validation, Testing) dan plugin build.<br>- Mengatur versi Java ke 21.</td>
			</tr>
			<tr>
				<td><b><a href='MultipleFiles/HELP.md'>HELP.md</a></b></td>
				<td>- Dokumentasi referensi dan panduan memulai untuk proyek Spring Boot ini, termasuk tautan ke dokumentasi resmi Maven, Spring Boot, dan panduan terkait seperti Spring Web, Thymeleaf, dan Spring Data JPA.</td>
			</tr>
			<tr>
				<td><b><a href='MultipleFiles/settings.json'>settings.json</a></b></td>
				<td>- File konfigurasi untuk pengaturan Java di lingkungan pengembangan, khususnya untuk pembaruan konfigurasi build.</td>
			</tr>
			</table>
		</blockquote>
	</details>
	<details> <!-- src/main/java Submodule -->
		<summary><b>src/main/java</b></summary>
		<blockquote>
			<details>
				<summary><b>com.example.demo</b></summary>
				<blockquote>
					<table>
					<tr>
						<td><b><a href='MultipleFiles/DemoApplication.java'>DemoApplication.java</a></b></td>
						<td>- Kelas utama aplikasi Spring Boot yang berfungsi sebagai titik masuk untuk menjalankan aplikasi.</td>
					</tr>
					</table>
					<details>
						<summary><b>controller</b></summary>
						<blockquote>
							<table>
							<tr>
								<td><b><a href='MultipleFiles/MahasiswaController.java'>MahasiswaController.java</a></b></td>
								<td>- Mengelola permintaan HTTP terkait data mahasiswa.<br>- Menyediakan endpoint untuk melihat daftar mahasiswa, menampilkan formulir tambah/edit, menyimpan data, dan menghapus data.<br>- Menggunakan `MahasiswaService` untuk interaksi dengan lapisan layanan.</td>
							</tr>
							</table>
						</blockquote>
					</details>
					<details>
						<summary><b>exception</b></summary>
						<blockquote>
							<table>
							<tr>
								<td><b><a href='MultipleFiles/MahasiswaNotFoundException.java'>MahasiswaNotFoundException.java</a></b></td>
								<td>- Custom exception yang dilemparkan ketika data mahasiswa tidak ditemukan berdasarkan ID.</td>
							</tr>
							</table>
						</blockquote>
					</details>
					<details>
						<summary><b>model</b></summary>
						<blockquote>
							<table>
							<tr>
								<td><b><a href='MultipleFiles/Mahasiswa.java'>Mahasiswa.java</a></b></td>
								<td>- Entitas JPA yang merepresentasikan tabel `mahasiswa` dalam database.<br>- Mendefinisikan properti `id`, `nama`, `nim`, `jurusan`, `tanggalKunjungan`, dan `keperluan`.<br>- Mengandung anotasi validasi untuk memastikan integritas data.</td>
							</tr>
							</table>
						</blockquote>
					</details>
					<details>
						<summary><b>repository</b></summary>
						<blockquote>
							<table>
							<tr>
								<td><b><a href='MultipleFiles/MahasiswaRepository.java'>MahasiswaRepository.java</a></b></td>
								<td>- Antarmuka repository yang memperluas `JpaRepository` untuk operasi CRUD pada entitas `Mahasiswa`.<br>- Menyediakan metode bawaan untuk interaksi database tanpa perlu implementasi manual.</td>
							</tr>
							</table>
						</blockquote>
					</details>
					<details>
						<summary><b>service</b></summary>
						<blockquote>
							<table>
							<tr>
								<td><b><a href='MultipleFiles/IMahasiswaService.java'>IMahasiswaService.java</a></b></td>
								<td>- Antarmuka yang mendefinisikan kontrak untuk layanan mahasiswa.<br>- Mencakup metode untuk mendapatkan semua mahasiswa, menyimpan, mendapatkan berdasarkan ID, dan menghapus mahasiswa.</td>
							</tr>
							<tr>
								<td><b><a href='MultipleFiles/MahasiswaService.java'>MahasiswaService.java</a></b></td>
								<td>- Implementasi dari `IMahasiswaService`.<br>- Berinteraksi dengan `MahasiswaRepository` untuk melakukan operasi bisnis.<br>- Menangani logika untuk mengambil, menyimpan, dan menghapus data mahasiswa, termasuk penanganan `MahasiswaNotFoundException`.</td>
							</tr>
							</table>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<details> <!-- src/main/resources Submodule -->
		<summary><b>src/main/resources</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='MultipleFiles/application.properties'>application.properties</a></b></td>
				<td>- File konfigurasi untuk properti aplikasi Spring Boot (binary file).</td>
			</tr>
			</table>
			<details>
				<summary><b>static</b></summary>
				<blockquote>
					<details>
						<summary><b>css</b></summary>
						<blockquote>
							<table>
							<tr>
								<td><b><a href='MultipleFiles/style.css'>style.css</a></b></td>
								<td>- File CSS kustom untuk styling aplikasi, mengatur warna latar belakang, lebar container, margin tabel, dan elemen formulir.</td>
							</tr>
							</table>
						</blockquote>
					</details>
				</blockquote>
			</details>
			<details>
				<summary><b>templates</b></summary>
				<blockquote>
					<table>
					<tr>
						<td><b><a href='MultipleFiles/add.html'>add.html</a></b></td>
						<td>- Halaman HTML untuk menambahkan data mahasiswa/tamu baru.<br>- Menggunakan Thymeleaf untuk binding data dan menampilkan pesan error validasi.</td>
					</tr>
					<tr>
						<td><b><a href='MultipleFiles/edit.html'>edit.html</a></b></td>
						<td>- Halaman HTML untuk mengedit data mahasiswa/tamu yang sudah ada.<br>- Mirip dengan `add.html` tetapi menyertakan input tersembunyi untuk ID mahasiswa.</td>
					</tr>
					<tr>
						<td><b><a href='MultipleFiles/index.html'>index.html</a></b></td>
						<td>- Halaman utama yang menampilkan daftar semua mahasiswa/tamu dalam bentuk tabel.<br>- Menyediakan tautan untuk menambah data baru, mengedit, dan menghapus data yang ada.</td>
					</tr>
					</table>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<details> <!-- src/test/java Submodule -->
		<summary><b>src/test/java</b></summary>
		<blockquote>
			<details>
				<summary><b>com.example.demo</b></summary>
				<blockquote>
					<table>
					<tr>
						<td><b><a href='MultipleFiles/DemoApplicationTests.java'>DemoApplicationTests.java</a></b></td>
						<td>- Kelas pengujian dasar untuk memverifikasi bahwa konteks aplikasi Spring Boot dapat dimuat dengan benar.</td>
					</tr>
					</table>
				</blockquote>
			</details>
		</blockquote>
	</details>
</details>

---

## 👥 Collaborators

- [@aryantiina](https://github.com/aryantiina)
- [@elsasitimariyam](https://github.com/elsasitimariyam)

