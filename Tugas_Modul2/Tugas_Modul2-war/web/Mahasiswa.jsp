<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Mahasiwa</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body style="font-family: sans-serif; font-family : “Comic Sans MS”, cursive, sans-serif; background: #d5f0f3;">
    <header>
      <h1 style="text-align: center;font-weight: 300;">Mahasiwa</h1>
    </header>
    <main>
        <% String stat = (String)request.getAttribute("status");
            if(stat != "true"){%>
            <form action="Mahasiswa" method="post" style="width: 350px;background: white;margin: 80px auto;padding: 30px 20px;">
                <label for="nama" style="margin-bottom:5px">Nama Mahasiswa</label>
                <input id="nama" type="text" name="nama" placeholder="Nama Mahasiswa" style="box-sizing : border-box;width: 100%;padding: 10px;font-size: 11pt;margin-bottom: 20px;">
                <span style="color:green">${namaEr}</span>
                <br><br>
                <label for="nim" style="margin-bottom:5px">NIM Mahasiswa</label>
                <input id="nim" type="text" name="nim" placeholder="NIM Mahasiswa" style="box-sizing : border-box;width: 100%;padding: 10px;font-size: 11pt;margin-bottom: 20px;">
                <span style="color:green">${nimEr}</span>
                <br><br>
                <input type="submit" name="submit" value="Tambah" style="background: #46de4b;color: white;font-size: 11pt;width: 100%;border: none;border-radius: 3px;padding: 10px 20px;">
                <br>
            </form>
                <form action="Mahasiswa" method="post" style="width: 350px;background: white;margin: 80px auto;padding: 30px 20px;">
                <label for="namasearch" style="margin-bottom:5px">Cari Mahasiswa</label>
                <input id="namasearch" type="text" name="namasearch" placeholder="Masukan Nama / NIM" style="box-sizing : border-box;width: 100%;padding: 10px;font-size: 11pt;margin-bottom: 20px;">
                <span style="color:green">${hasil}</span>
                <br><br>
                <input type="submit" name="submit" value="Cari" style="background: #46de4b;color: white;font-size: 11pt;width: 100%;border: none;border-radius: 3px;padding: 10px 20px;">
            </form>
            <%}%>
    </main><br>
    <footer style="text-align:center">&copy; Copyright Matamu 2019</footer>
  </body>
