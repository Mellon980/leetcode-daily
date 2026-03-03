@echo off
echo ==============================
echo  LeetCode 每日一题 一键上传
echo  Author: Mellon980
echo ==============================
set /p msg=输入提交信息（例：2026-03-03 两数之和）:

git add .
git commit -m "%msg%"
git push origin main

echo.
echo ✅ 上传成功！
pause >nul