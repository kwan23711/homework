function upDate(previewPic) {
  console.log('ฟังก์ชัน upDate ถูกเรียก');
  console.log('Alt: ' + previewPic.alt);
  console.log('Source: ' + previewPic.src);

  document.getElementById('image').innerText = previewPic.alt;
  document.getElementById('image').style.backgroundImage = 'url(' + previewPic.src + ')';
}

const thumbnails = document.querySelectorAll('.thumbnail');
thumbnails.forEach(thumbnail => {
  thumbnail.addEventListener('mouseover', () => upDate(thumbnail));
});

function undo() {
  console.log('ฟังก์ชัน Undo ถูกเรียก');
  document.getElementById('image').style.backgroundImage = "url('')";
  document.getElementById('image').innerText = "เลือกภาพที่ต้องการดูตัวอย่างที่นี่.";
}

document.getElementById('undoButton').addEventListener('click', undo);