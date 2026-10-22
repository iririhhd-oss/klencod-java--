package com.klencod.compass;<!DOCTYPE html>
<html lang="ar" dir="rtl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>منصة صانع أدوات بايثون - Python Tool Builder</title>
    <!-- Tailwind CSS -->
    <script src="https://cdn.tailwindcss.com"></script>
    <!-- Prism.js للتلوين البرمجي -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/prism/1.29.0/themes/prism-tomorrow.min.css" rel="stylesheet" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/prism/1.29.0/prism.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/prism/1.29.0/components/prism-python.min.js"></script>
    <!-- FontAwesome للأيقونات -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Tajawal:wght@400;500;700;900&display=swap');
        body {
            font-family: 'Tajawal', sans-serif;
            background-color: #0f172a;
            color: #f8fafc;
        }
        pre[class*="language-"] {
            margin: 0;
            border-radius: 0.5rem;
            background: #1e293b !important;
        }
    </style>
</head>
<body class="min-h-screen flex flex-col">

    <!-- Header -->
    <header class="border-b border-slate-800 bg-slate-900/80 backdrop-blur sticky top-0 z-50">
        <div class="max-w-7xl mx-auto px-4 py-4 flex items-center justify-between">
            <div class="flex items-center space-x-3 space-x-reverse">
                <div class="bg-gradient-to-r from-blue-500 to-indigo-600 p-2.5 rounded-xl shadow-lg shadow-blue-500/20">
                    <i class="fa-brands font-bold fa-python text-2xl text-white"></i>
                </div>
                <div>
                    <h1 class="text-xl font-bold bg-gradient-to-r from-white to-slate-400 bg-clip-text text-transparent">منشئ أدوات بايثون الأخلاقية</h1>
                    <p class="text-xs text-slate-400">صمم أدوات الأتمتة والفحص والأمن الأخلاقي بسهولة</p>
                </div>
            </div>
            <span class="inline-flex items-center gap-1.5 py-1 px-3 rounded-full text-xs font-medium bg-emerald-500/10 text-emerald-400 border border-emerald-500/20">
                <span class="w-2 h-2 rounded-full bg-emerald-400 animate-pulse"></span>
                جاهز للتوليد
            </span>
        </div>
    </header>

    <!-- Main Content -->
    <main class="flex-1 max-w-7xl w-full mx-auto p-4 md:p-6 grid grid-cols-1 lg:grid-cols-12 gap-6">

        <!-- Controls Sidebar -->
        <div class="lg:col-span-5 flex flex-col gap-6">
            
            <!-- Tool Selection Card -->
            <div class="bg-slate-900 border border-slate-800 rounded-2xl p-5 shadow-xl">
                <h2 class="text-lg font-bold text-white mb-4 flex items-center gap-2">
                    <i class="fa-solid fa-[#38bdf8] fa-sliders text-blue-400"></i>
                    1. اختر نوع الأداة المراد إنشاؤها
                </h2>

                <div class="space-y-3">
                    <label class="block p-3 rounded-xl border border-slate-800 bg-slate-800/40 hover:bg-slate-800/80 cursor-pointer transition">
                        <input type="radio" name="toolType" value="hash_checker" checked class="hidden peer" onchange="updateOptions()">
                        <div class="flex items-center justify-between peer-checked:text-blue-400">
                            <div class="flex items-center gap-3">
                                <i class="fa-solid fa-file-shield text-lg text-emerald-400"></i>
                                <div>
                                    <div class="font-semibold text-slate-200">فاحص سلامة الملفات (Hash Checker)</div>
                                    <div class="text-xs text-slate-400">حساب وتحقق من بصمات MD5, SHA256 للملفات</div>
                                </div>
                            </div>
                            <div class="w-4 h-4 rounded-full border-2 border-slate-600 peer-checked:border-blue-500 peer-checked:bg-blue-500"></div>
                        </div>
                    </label>

                    <label class="block p-3 rounded-xl border border-slate-800 bg-slate-800/40 hover:bg-slate-800/80 cursor-pointer transition">
                        <input type="radio" name="toolType" value="port_scanner" class="hidden peer" onchange="updateOptions()">
                        <div class="flex items-center justify-between peer-checked:text-blue-400">
                            <div class="flex items-center gap-3">
                                <i class="fa-solid fa-network-wired text-lg text-blue-400"></i>
                                <div>
                                    <div class="font-semibold text-slate-200">فاحص المنافذ المحلي (Port Scanner)</div>
                                    <div class="text-xs text-slate-400">فحص المنافذ المفتوحة داخل الشبكة للتأكد من أمانها</div>
                                </div>
                            </div>
                            <div class="w-4 h-4 rounded-full border-2 border-slate-600 peer-checked:border-blue-500 peer-checked:bg-blue-500"></div>
                        </div>
                    </label>

                    <label class="block p-3 rounded-xl border border-slate-800 bg-slate-800/40 hover:bg-slate-800/80 cursor-pointer transition">
                        <input type="radio" name="toolType" value="encryptor" class="hidden peer" onchange="updateOptions()">
                        <div class="flex items-center justify-between peer-checked:text-blue-400">
                            <div class="flex items-center gap-3">
                                <i class="fa-solid fa-lock text-lg text-purple-400"></i>
                                <div>
                                    <div class="font-semibold text-slate-200">مشفر النصوص والملفات (AES Encryptor)</div>
                                    <div class="text-xs text-slate-400">تشفير وفك تشفير البيانات الحساسة بمفتاح آمن</div>
                                </div>
                            </div>
                            <div class="w-4 h-4 rounded-full border-2 border-slate-600 peer-checked:border-blue-500 peer-checked:bg-blue-500"></div>
                        </div>
                    </label>

                    <label class="block p-3 rounded-xl border border-slate-800 bg-slate-800/40 hover:bg-slate-800/80 cursor-pointer transition">
                        <input type="radio" name="toolType" value="log_analyzer" class="hidden peer" onchange="updateOptions()">
                        <div class="flex items-center justify-between peer-checked:text-blue-400">
                            <div class="flex items-center gap-3">
                                <i class="fa-solid fa-list-check text-lg text-amber-400"></i>
                                <div>
                                    <div class="font-semibold text-slate-200">محلل السجلات (Log Analyzer)</div>
                                    <div class="text-xs text-slate-400">استخراج وتصنيف محاولات الدخول المشبوهة</div>
                                </div>
                            </div>
                            <div class="w-4 h-4 rounded-full border-2 border-slate-600 peer-checked:border-blue-500 peer-checked:bg-blue-500"></div>
                        </div>
                    </label>
                </div>
            </div>

            <!-- Custom Options Dynamic Panel -->
            <div class="bg-slate-900 border border-slate-800 rounded-2xl p-5 shadow-xl">
                <h2 class="text-lg font-bold text-white mb-4 flex items-center gap-2">
                    <i class="fa-solid fa-sliders text-indigo-400"></i>
                    2. تخصيص الخيارات للأداة
                </h2>

                <div id="dynamic-options" class="space-y-4">
                    <!-- Dynamic Controls Here -->
                </div>

                <div class="mt-6 pt-4 border-t border-slate-800">
                    <label class="flex items-center gap-3 cursor-pointer">
                        <input type="checkbox" id="include-cli" checked class="w-4 h-4 rounded bg-slate-800 border-slate-700 text-blue-600 focus:ring-blue-500">
                        <span class="text-sm text-slate-300">إضافة دعم واجهة الأوامر (argparse CLI)</span>
                    </label>
                </div>

                <button onclick="generateToolCode()" class="w-full mt-5 bg-gradient-to-r from-blue-600 to-indigo-600 hover:from-blue-500 hover:to-indigo-500 text-white font-bold py-3 px-4 rounded-xl shadow-lg transition flex items-center justify-center gap-2">
                    <i class="fa-solid fa-wand-magic-sparkles"></i>
                    توليد أداة البايثون الان
                </button>
            </div>

        </div>

        <!-- Code Display & Output Container -->
        <div class="lg:col-span-7 flex flex-col gap-6">
            
            <div class="bg-slate-900 border border-slate-800 rounded-2xl shadow-xl flex flex-col flex-1 overflow-hidden">
                <!-- Header Actions -->
                <div class="bg-slate-950/60 p-4 border-b border-slate-800 flex items-center justify-between">
                    <div class="flex items-center gap-2">
                        <span class="w-3 h-3 rounded-full bg-red-500"></span>
                        <span class="w-3 h-3 rounded-full bg-yellow-500"></span>
                        <span class="w-3 h-3 rounded-full bg-green-500"></span>
                        <span id="script-filename" class="text-xs text-slate-400 font-mono mr-2">tool_script.py</span>
                    </div>
                    
                    <div class="flex items-center gap-2">
                        <button onclick="copyCode()" class="px-3 py-1.5 rounded-lg bg-slate-800 hover:bg-slate-700 text-slate-300 text-xs font-semibold flex items-center gap-1.5 transition">
                            <i class="fa-regular fa-copy"></i>
                            نسخ الكود
                        </button>
                        <button onclick="downloadCode()" class="px-3 py-1.5 rounded-lg bg-blue-600/20 hover:bg-blue-600/30 text-blue-400 text-xs font-semibold flex items-center gap-1.5 border border-blue-500/30 transition">
                            <i class="fa-solid fa-download"></i>
                            تحميل الملف (.py)
                        </button>
                    </div>
                </div>

                <!-- Code Container -->
                <div class="p-4 flex-1 overflow-auto bg-[#1e293b]">
                    <pre><code id="python-code" class="language-python"># اختر الأداة ثم اضغط توليد لعرض الكود...</code></pre>
                </div>
            </div>

            <!-- Instructions Card -->
            <div class="bg-slate-900 border border-slate-800 rounded-2xl p-5 shadow-xl">
                <h3 class="text-md font-bold text-white mb-2 flex items-center gap-2">
                    <i class="fa-solid fa-terminal text-emerald-400"></i>
                    كيفية التشغيل الاستخدام:
                </h3>
                <div class="bg-slate-950 p-3 rounded-lg font-mono text-xs text-slate-300 overflow-x-auto mb-3" id="execution-command">
                    python tool_script.py --help
                </div>
                <p class="text-xs text-slate-400 leading-relaxed" id="execution-notes">
                    يمكنك تشغيل هذا السكربت عبر بيئة Python 3.x مثبتة على جهازك مباشرة بكل سهولة.
                </p>
            </div>

        </div>

    </main>

    <!-- Script JavaScript Logic -->
    <script>
        const toolsData = {
            hash_checker: {
                filename: "hash_checker.py",
                options: `
                    <div>
                        <label class="block text-xs font-medium text-slate-400 mb-1">نوع التشفير (Algorithm):</label>
                        <select id="opt-algo" class="w-full bg-slate-800 border border-slate-700 rounded-lg p-2.5 text-sm text-slate-200 focus:outline-none focus:border-blue-500">
                            <option value="sha256">SHA-256 (موصى به)</option>
                            <option value="md5">MD5</option>
                            <option value="sha1">SHA-1</option>
                        </select>
                    </div>
                `,
                generate: (cli) => {
                    return `import hashlib
import os
import sys
${cli ? 'import argparse\n' : ''}
def calculate_file_hash(file_path, algorithm='sha256'):
    """
    حساب البصمة الرقمية (Hash) للملف للتحقق من سلامته وعدم التلاعب به
    """
    if not os.path.isfile(file_path):
        print(f"[-] الخطأ: الملف غير موجود: {file_path}")
        return None

    hash_func = getattr(hashlib, algorithm.lower())()
    
    try:
        with open(file_path, 'rb') as f:
            for chunk in iter(lambda: f.read(4096), b""):
                hash_func.update(chunk)
        return hash_func.hexdigest()
    except Exception as e:
        print(f"[-] حدث خطأ أثناء قراءة الملف: {e}")
        return None

def main():
    print("=" * 50)
    print("   أداة فحص سلامة الملفات - Hash Checker Tool")
    print("=" * 50)
    
${cli ? `    parser = argparse.ArgumentParser(description="أداة لحساب البصمة الرقمية للملفات.")
    parser.add_argument("-f", "--file", required=True, help="مسار الملف المُراد فحصه")
    parser.add_argument("-a", "--algo", default="sha256", choices=["md5", "sha1", "sha256"], help="خوارزمية التشفير")
    args = parser.parse_args()

    file_path = args.file
    algo = args.algo` : `    file_path = input("أدخل مسار الملف المراد فحصه: ").strip()
    algo = "sha256"`}

    print(f"[*] جاري حساب {algo.upper()} للملف: {file_path}")
    result_hash = calculate_file_hash(file_path, algo)
    
    if result_hash:
        print(f"[+] البصمة الناتجة ({algo.upper()}): {result_hash}")

if __name__ == "__main__":
    main()`;
                },
                cmd: "python hash_checker.py --file myfile.txt --algo sha256",
                notes: "تستخدم هذه الأداة للتحقق من أن الملفات لم تتغير أو تتعرض للتعديل أثناء النقل."
            },

            port_scanner: {
                filename: "port_scanner.py",
                options: `
                    <div>
                        <label class="block text-xs font-medium text-slate-400 mb-1">مهلة الاتصال (Timeout بالثواني):</label>
                        <input type="number" id="opt-timeout" value="1" min="1" max="10" class="w-full bg-slate-800 border border-slate-700 rounded-lg p-2 text-sm text-slate-200">
                    </div>
                `,
                generate: (cli) => {
                    return `import socket
import sys
from datetime import datetime
${cli ? 'import argparse\n' : ''}
def scan_ports(target_host, ports_to_scan, timeout=1.0):
    """
    فحص المنافذ المفتوحة على الهدف للتأكد من الخدمات النشطة
    """
    try:
        target_ip = socket.gethostbyname(target_host)
    except socket.gaierror:
        print(f"[-] تعذر الوصول للهدف: {target_host}")
        return

    print(f"[*] بدء الفحص على الهدف: {target_host} ({target_ip})")
    print(f"[*] الوقت: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}\n")

    for port in ports_to_scan:
        sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        sock.settimeout(timeout)
        result = sock.connect_ex((target_ip, port))
        
        if result == 0:
            print(f"[+] المنفذ {port:<5} : مفتوح (OPEN)")
        sock.close()

def main():
    print("=" * 50)
    print("   أداة فحص المنافذ المحلية - Ethical Port Scanner")
    print("=" * 50)

${cli ? `    parser = argparse.ArgumentParser(description="فحص منافذ الشبكة المحلية.")
    parser.add_argument("-t", "--target", default="127.0.0.1", help="عنوان IP أو النطاق")
    parser.add_argument("-p", "--ports", default="21,22,80,443,8080", help="قائمة المنافذ تفصل بينها فاصلة")
    args = parser.parse_args()

    target = args.target
    ports = [int(p.strip()) for p in args.ports.split(",") if p.strip().isdigit()]` : `    target = input("أدخل عنوان IP (افتراضي 127.0.0.1): ") or "127.0.0.1"
    ports = [21, 22, 80, 443, 8080]`}

    scan_ports(target, ports)

if __name__ == "__main__":
    main()`;
                },
                cmd: "python port_scanner.py --target 127.0.0.1 --ports 80,443,8080",
                notes: "يُفضل استخدامها على الأجهزة والمناطق المسموح لك بفحصها أخلاقياً ومحلياً فقط."
            },

            encryptor: {
                filename: "aes_encryptor.py",
                options: `
                    <div>
                        <label class="block text-xs font-medium text-slate-400 mb-1">طريقة التشفير:</label>
                        <select id="opt-cipher" class="w-full bg-slate-800 border border-slate-700 rounded-lg p-2 text-sm text-slate-200">
                            <option value="base64">Base64 + XOR (بسيط للتعليم)</option>
                        </select>
                    </div>
                `,
                generate: (cli) => {
                    return `import base64
import sys
${cli ? 'import argparse\n' : ''}
def xor_encrypt_decrypt(data: str, key: str) -> str:
    """
    تشفير وفك تشفير النصوص باستخدام خوارزمية XOR مع مفتاح سرّي
    """
    key_bytes = key.encode('utf-8')
    data_bytes = data.encode('utf-8')
    
    encrypted_bytes = bytearray()
    for i in range(len(data_bytes)):
        encrypted_bytes.append(data_bytes[i] ^ key_bytes[i % len(key_bytes)])
        
    return base64.b64encode(encrypted_bytes).decode('utf-8')

def xor_decrypt(encoded_data: str, key: str) -> str:
    try:
        raw_bytes = base64.b64decode(encoded_data.encode('utf-8'))
        key_bytes = key.encode('utf-8')
        
        decrypted_bytes = bytearray()
        for i in range(len(raw_bytes)):
            decrypted_bytes.append(raw_bytes[i] ^ key_bytes[i % len(key_bytes)])
            
        return decrypted_bytes.decode('utf-8')
    except Exception as e:
        return f"[-] خطأ أثناء فك التشفير: مفتاح غير صحيح أو نص تالف"

def main():
    print("=" * 50)
    print("   أداة تشفير البيانات - Simple Encryptor Tool")
    print("=" * 50)

${cli ? `    parser = argparse.ArgumentParser(description="أداة لتشفير وفك تشفير النصوص.")
    parser.add_argument("-m", "--mode", choices=["encrypt", "decrypt"], required=True, help="وضع التشغيل")
    parser.add_argument("-t", "--text", required=True, help="النص المراد تشفيره أو فك تشفيره")
    parser.add_argument("-k", "--key", required=True, help="مفتاح التشفير")
    args = parser.parse_args()

    if args.mode == "encrypt":
        res = xor_encrypt_decrypt(args.text, args.key)
        print(f"[+] النص المشفر: {res}")
    else:
        res = xor_decrypt(args.text, args.key)
        print(f"[+] النص الأصلي: {res}")` : `    mode = input("اختر (1 للتشفير / 2 لفك التشفير): ")
    text = input("أدخل النص: ")
    key = input("أدخل السر/المفتاح: ")
    
    if mode == "1":
        print(f"[+] النص المشفر: {xor_encrypt_decrypt(text, key)}")
    else:
        print(f"[+] النص الأصلي: {xor_decrypt(text, key)}")`}

if __name__ == "__main__":
    main()`;
                },
                cmd: "python aes_encryptor.py --mode encrypt --text 'مرحبا' --key 'MySecret123'",
                notes: "أداة تعليمية توضح طريقة عمل التشفير والتعامل مع المفاتيح السرية."
            },

            log_analyzer: {
                filename: "log_analyzer.py",
                options: `
                    <div>
                        <label class="block text-xs font-medium text-slate-400 mb-1">الكلمة المفتاحية للبحث:</label>
                        <input type="text" id="opt-keyword" value="FAILED" class="w-full bg-slate-800 border border-slate-700 rounded-lg p-2 text-sm text-slate-200">
                    </div>
                `,
                generate: (cli) => {
                    return `import re
import sys
${cli ? 'import argparse\n' : ''}
def analyze_logs(log_file, keyword="FAILED"):
    """
    تحليل سجلات النظام واستخراج المحاولات الفاشلة أو المشبوهة
    """
    try:
        with open(log_file, 'r', encoding='utf-8', errors='ignore') as f:
            lines = f.readlines()
            
        print(f"[*] جاري قراءة {len(lines)} سطر من السجل...\n")
        matches = [line.strip() for line in lines if keyword.lower() in line.lower()]
        
        print(f"[+] تم العثور على ({len(matches)}) نتيجة تحتوي الكلمة المفتاحية '{keyword}':")
        print("-" * 60)
        for idx, match in enumerate(matches[:20], 1):
            print(f"{idx}. {match}")
            
        if len(matches) > 20:
            print(f"\n... وهناك {len(matches) - 20} نتائج إضافية.")

    except FileNotFoundError:
        print(f"[-] خطأ: لم يتم العثور على الملف {log_file}")

def main():
    print("=" * 50)
    print("   أداة تحليل السجلات - Log Analyzer Tool")
    print("=" * 50)

${cli ? `    parser = argparse.ArgumentParser(description="تحليل سجلات الخوادم والأجهزة.")
    parser.add_argument("-f", "--file", required=True, help="مسار ملف السجل (log)")
    parser.add_argument("-k", "--keyword", default="FAILED", help="الكلمة المراد تتبعها")
    args = parser.parse_args()

    analyze_logs(args.file, args.keyword)` : `    log_file = input("أدخل مسار ملف السجل (.log): ")
    keyword = input("الكلمة المفتاحية للبحث (مثال FAILED/ERROR): ") or "FAILED"
    analyze_logs(log_file, keyword)`}

if __name__ == "__main__":
    main()`;
                },
                cmd: "python log_analyzer.py --file auth.log --keyword FAILED",
                notes: "تساعد مدراء الأنظمة على اكتشاف أي محاولات تسجيل دخول مشبوهة أو أخطاء الخوادم."
            }
        };

        let currentToolKey = 'hash_checker';

        function updateOptions() {
            const selected = document.querySelector('input[name="toolType"]:checked').value;
            currentToolKey = selected;
            const tool = toolsData[selected];
            
            document.getElementById('dynamic-options').innerHTML = tool.options;
            document.getElementById('script-filename').innerText = tool.filename;
            document.getElementById('execution-command').innerText = tool.cmd;
            document.getElementById('execution-notes').innerText = tool.notes;

            generateToolCode();
        }

        function generateToolCode() {
            const tool = toolsData[currentToolKey];
            const includeCli = document.getElementById('include-cli').checked;
            const generatedCode = tool.generate(includeCli);
            
            const codeElement = document.getElementById('python-code');
            codeElement.textContent = generatedCode;
            Prism.highlightElement(codeElement);
        }

        function copyCode() {
            const codeText = document.getElementById('python-code').textContent;
            navigator.clipboard.writeText(codeText).then(() => {
                alert("تم نسخ كود بايثون إلى الحافظة بنجاح!");
            });
        }

        function downloadCode() {
            const codeText = document.getElementById('python-code').textContent;
            const filename = toolsData[currentToolKey].filename;
            const blob = new Blob([codeText], { type: 'text/x-python' });
            const link = document.createElement('a');
            link.href = URL.createObjectURL(blob);
            link.download = filename;
            link.click();
        }

        // Initialize default view
        window.onload = () => {
            updateOptions();
        };
    </script>
</body>
</html>


import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 * لوحة رسم بسيطة — قالب KlencodIDE
 *
 * الميزات:
 *   - رسم بالإصبع (Canvas + Path)
 *   - 8 ألوان
 *   - 3 سماكات فرشاة
 *   - تراجع (Undo)
 *   - مسح الكل
 *   - حفظ PNG في Pictures/KlencodDrawings (Android 10+)
 *
 * © 2026 KlencodIDE
 */
public class MainActivity extends Activity {

    // ============================================================
    // الألوان الأساسية (نفس ألوان KlencodIDE)
    // ============================================================
    private static final int COLOR_BG = 0xFF0D1117;
    private static final int COLOR_SURFACE = 0xFF161B22;
    private static final int COLOR_SURFACE_ALT = 0xFF21262D;
    private static final int COLOR_PRIMARY = 0xFF1F6FEB;
    private static final int COLOR_PRIMARY_LIGHT = 0xFF58A6FF;
    private static final int COLOR_TEXT = 0xFFE6EDF3;
    private static final int COLOR_MUTED = 0xFF8B949E;
    private static final int COLOR_BORDER = 0xFF30363D;

    // 8 ألوان للرسم
    private static final int[] PALETTE = {
            0xFFFFFFFF, // أبيض
            0xFF000000, // أسود
            0xFFFF7B72, // أحمر
            0xFF7EE787, // أخضر
            0xFF58A6FF, // أزرق
            0xFFD2A8FF, // بنفسجي
            0xFFFFD33D, // أصفر
            0xFFFF9E64  // برتقالي
    };

    // 3 سماكات
    private static final float[] BRUSH_SIZES = {4f, 10f, 22f};

    // ============================================================
    // الحالة
    // ============================================================
    private DrawingView drawingView;
    private int currentColorIndex = 2;  // أحمر افتراضي
    private int currentSizeIndex = 1;   // متوسط افتراضي
    private final ArrayList<Button> colorButtons = new ArrayList<>();
    private final ArrayList<Button> sizeButtons = new ArrayList<>();

    // ============================================================
    // dp helper
    // ============================================================
    private int dp(int value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }

    // ============================================================
    // onCreate
    // ============================================================
    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);

        getWindow().setStatusBarColor(COLOR_BG);
        getWindow().setNavigationBarColor(COLOR_BG);

        // Root
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(COLOR_BG);

        // ============================================================
        // الترويسة العلوية
        // ============================================================
        LinearLayout header = new LinearLayout(this);
        header.setOrientation(LinearLayout.HORIZONTAL);
        header.setGravity(Gravity.CENTER_VERTICAL);
        header.setPadding(dp(14), dp(10), dp(14), dp(10));
        header.setBackgroundColor(COLOR_SURFACE);

        TextView title = new TextView(this);
        title.setText("🎨 لوحة الرسم");
        title.setTextColor(COLOR_TEXT);
        title.setTextSize(17);
        title.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        header.addView(title, new LinearLayout.LayoutParams(0, -2, 1f));

        Button undoBtn = makeTopButton("↶ تراجع");
        undoBtn.setOnClickListener(v -> drawingView.undo());
        header.addView(undoBtn, new LinearLayout.LayoutParams(-2, dp(40)));

        Button clearBtn = makeTopButton("🗑 مسح");
        clearBtn.setOnClickListener(v -> confirmClear());
        LinearLayout.LayoutParams clearParams = new LinearLayout.LayoutParams(-2, dp(40));
        clearParams.leftMargin = dp(6);
        header.addView(clearBtn, clearParams);

        root.addView(header, new LinearLayout.LayoutParams(-1, -2));

        // ============================================================
        // منطقة الرسم
        // ============================================================
        FrameLayout drawContainer = new FrameLayout(this);
        drawContainer.setBackgroundColor(Color.WHITE);

        drawingView = new DrawingView(this);
        drawContainer.addView(drawingView, new FrameLayout.LayoutParams(-1, -1));

        LinearLayout.LayoutParams drawParams = new LinearLayout.LayoutParams(-1, 0, 1f);
        drawParams.setMargins(dp(12), dp(12), dp(12), dp(12));
        root.addView(drawContainer, drawParams);

        // ============================================================
        // شريط التحكم السفلي
        // ============================================================
        LinearLayout controls = new LinearLayout(this);
        controls.setOrientation(LinearLayout.VERTICAL);
        controls.setPadding(dp(12), dp(10), dp(12), dp(12));
        controls.setBackgroundColor(COLOR_SURFACE);

        // --- صف الألوان ---
        TextView colorLabel = new TextView(this);
        colorLabel.setText("اللون:");
        colorLabel.setTextColor(COLOR_MUTED);
        colorLabel.setTextSize(12);
        controls.addView(colorLabel);

        LinearLayout colorRow = new LinearLayout(this);
        colorRow.setOrientation(LinearLayout.HORIZONTAL);
        colorRow.setGravity(Gravity.CENTER_VERTICAL);
        LinearLayout.LayoutParams colorRowParams = new LinearLayout.LayoutParams(-1, dp(50));
        colorRowParams.topMargin = dp(6);
        controls.addView(colorRow, colorRowParams);

        for (int i = 0; i < PALETTE.length; i++) {
            final int index = i;
            Button colorBtn = new Button(this);
            colorBtn.setBackground(makeCircleDrawable(PALETTE[i]));
            colorBtn.setPadding(0, 0, 0, 0);
            colorBtn.setOnClickListener(v -> selectColor(index));

            LinearLayout.LayoutParams cp = new LinearLayout.LayoutParams(0, dp(40), 1f);
            cp.setMargins(dp(3), 0, dp(3), 0);
            colorRow.addView(colorBtn, cp);
            colorButtons.add(colorBtn);
        }

        // --- صف السماكات ---
        TextView sizeLabel = new TextView(this);
        sizeLabel.setText("سماكة الفرشاة:");
        sizeLabel.setTextColor(COLOR_MUTED);
        sizeLabel.setTextSize(12);
        LinearLayout.LayoutParams sizeLabelParams = new LinearLayout.LayoutParams(-1, -2);
        sizeLabelParams.topMargin = dp(12);
        controls.addView(sizeLabel, sizeLabelParams);

        LinearLayout sizeRow = new LinearLayout(this);
        sizeRow.setOrientation(LinearLayout.HORIZONTAL);
        sizeRow.setGravity(Gravity.CENTER_VERTICAL);
        LinearLayout.LayoutParams sizeRowParams = new LinearLayout.LayoutParams(-1, dp(46));
        sizeRowParams.topMargin = dp(6);
        controls.addView(sizeRow, sizeRowParams);

        String[] sizeNames = {"رفيع", "متوسط", "عريض"};
        for (int i = 0; i < BRUSH_SIZES.length; i++) {
            final int index = i;
            Button sizeBtn = new Button(this);
            sizeBtn.setText(sizeNames[i]);
            sizeBtn.setTextSize(12);
            sizeBtn.setAllCaps(false);
            sizeBtn.setPadding(0, 0, 0, 0);
            sizeBtn.setOnClickListener(v -> selectSize(index));

            LinearLayout.LayoutParams sp = new LinearLayout.LayoutParams(0, dp(42), 1f);
            sp.setMargins(dp(4), 0, dp(4), 0);
            sizeRow.addView(sizeBtn, sp);
            sizeButtons.add(sizeBtn);
        }

        // --- صف الحفظ ---
        Button saveBtn = new Button(this);
        saveBtn.setText("💾 حفظ الصورة");
        saveBtn.setTextSize(14);
        saveBtn.setAllCaps(false);
        saveBtn.setTextColor(Color.WHITE);
        saveBtn.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        GradientDrawable saveBg = new GradientDrawable();
        saveBg.setColor(0xFF238636);
        saveBg.setCornerRadius(dp(12));
        saveBg.setStroke(dp(1), 0xFF56D364);
        saveBtn.setBackground(saveBg);
        saveBtn.setElevation(dp(2));
        saveBtn.setOnClickListener(v -> saveImage());

        LinearLayout.LayoutParams saveParams = new LinearLayout.LayoutParams(-1, dp(50));
        saveParams.topMargin = dp(14);
        controls.addView(saveBtn, saveParams);

        root.addView(controls, new LinearLayout.LayoutParams(-1, -2));

        setContentView(root);

        // الاختيارات الافتراضية
        selectColor(currentColorIndex);
        selectSize(currentSizeIndex);
    }

    // ============================================================
    // دوال مساعدة للواجهة
    // ============================================================
    private Button makeTopButton(String text) {
        Button btn = new Button(this);
        btn.setText(text);
        btn.setTextSize(12);
        btn.setAllCaps(false);
        btn.setTextColor(COLOR_TEXT);
        btn.setPadding(dp(12), 0, dp(12), 0);
        GradientDrawable bg = new GradientDrawable();
        bg.setColor(COLOR_SURFACE_ALT);
        bg.setCornerRadius(dp(10));
        bg.setStroke(dp(1), COLOR_BORDER);
        btn.setBackground(bg);
        return btn;
    }

    private GradientDrawable makeCircleDrawable(int color) {
        GradientDrawable d = new GradientDrawable();
        d.setShape(GradientDrawable.OVAL);
        d.setColor(color);
        d.setStroke(dp(2), COLOR_BORDER);
        return d;
    }

    private GradientDrawable makeSelectedCircleDrawable(int color) {
        GradientDrawable d = new GradientDrawable();
        d.setShape(GradientDrawable.OVAL);
        d.setColor(color);
        d.setStroke(dp(3), COLOR_PRIMARY_LIGHT);
        return d;
    }

    private GradientDrawable makeSizeButtonDrawable(boolean selected) {
        GradientDrawable d = new GradientDrawable();
        d.setCornerRadius(dp(10));
        d.setColor(selected ? COLOR_PRIMARY : COLOR_SURFACE_ALT);
        d.setStroke(dp(1), selected ? COLOR_PRIMARY_LIGHT : COLOR_BORDER);
        return d;
    }

    private void selectColor(int index) {
        currentColorIndex = index;
        drawingView.setColor(PALETTE[index]);

        for (int i = 0; i < colorButtons.size(); i++) {
            Button b = colorButtons.get(i);
            if (i == index) {
                b.setBackground(makeSelectedCircleDrawable(PALETTE[i]));
            } else {
                b.setBackground(makeCircleDrawable(PALETTE[i]));
            }
        }
    }

    private void selectSize(int index) {
        currentSizeIndex = index;
        drawingView.setStrokeWidth(BRUSH_SIZES[index]);

        for (int i = 0; i < sizeButtons.size(); i++) {
            Button b = sizeButtons.get(i);
            b.setBackground(makeSizeButtonDrawable(i == index));
            b.setTextColor(i == index ? Color.WHITE : COLOR_TEXT);
        }
    }

    // ============================================================
    // حفظ الصورة
    // ============================================================
    private void saveImage() {
        try {
            Bitmap bitmap = drawingView.exportBitmap();
            if (bitmap == null) {
                Toast.makeText(this, "لا يوجد شيء لحفظه", Toast.LENGTH_SHORT).show();
                return;
            }

            String timestamp = new SimpleDateFormat(
                    "yyyyMMdd_HHmmss", Locale.US).format(new Date());
            String fileName = "drawing_" + timestamp + ".png";

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                ContentValues values = new ContentValues();
                values.put(MediaStore.Images.Media.DISPLAY_NAME, fileName);
                values.put(MediaStore.Images.Media.MIME_TYPE, "image/png");
                values.put(MediaStore.Images.Media.RELATIVE_PATH,
                        Environment.DIRECTORY_PICTURES + "/KlencodDrawings");

                Uri uri = getContentResolver().insert(
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);

                if (uri == null) {
                    Toast.makeText(this, "تعذر إنشاء ملف", Toast.LENGTH_SHORT).show();
                    return;
                }

                OutputStream out = getContentResolver().openOutputStream(uri);
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, out);
                if (out != null) out.close();
                bitmap.recycle();

                Toast.makeText(this,
                        "✅ تم حفظ الصورة في:\nPictures/KlencodDrawings/" + fileName,
                        Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this,
                        "يحتاج Android 10+ للحفظ",
                        Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            Toast.makeText(this, "خطأ: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    private void confirmClear() {
        new AlertDialog.Builder(this)
                .setTitle("مسح اللوحة")
                .setMessage("هل أنت متأكد من مسح كل الرسم؟")
                .setPositiveButton("مسح", (d, w) -> drawingView.clear())
                .setNegativeButton("إلغاء", null)
                .show();
    }

    // ============================================================
    // DrawingView — Canvas مخصص
    // ============================================================
    private static class DrawingView extends View {

        private final ArrayList<Stroke> strokes = new ArrayList<>();
        private Stroke currentStroke;

        private int currentColor = Color.RED;
        private float currentStrokeWidth = 10f;

        public DrawingView(Activity context) {
            super(context);
            setFocusable(true);
            setBackgroundColor(Color.WHITE);
        }

        public void setColor(int color) {
            this.currentColor = color;
        }

        public void setStrokeWidth(float width) {
            this.currentStrokeWidth = width;
        }

        public void clear() {
            strokes.clear();
            currentStroke = null;
            invalidate();
        }

        public void undo() {
            if (strokes.isEmpty()) return;
            strokes.remove(strokes.size() - 1);
            invalidate();
        }

        public Bitmap exportBitmap() {
            if (getWidth() <= 0 || getHeight() <= 0) return null;
            Bitmap bmp = Bitmap.createBitmap(
                    getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bmp);
            canvas.drawColor(Color.WHITE);

            for (Stroke stroke : strokes) {
                stroke.draw(canvas);
            }
            if (currentStroke != null) {
                currentStroke.draw(canvas);
            }
            return bmp;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            for (Stroke stroke : strokes) {
                stroke.draw(canvas);
            }

            if (currentStroke != null) {
                currentStroke.draw(canvas);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            float x = event.getX();
            float y = event.getY();

            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    currentStroke = new Stroke(currentColor, currentStrokeWidth);
                    currentStroke.addPoint(x, y);
                    invalidate();
                    return true;

                case MotionEvent.ACTION_MOVE:
                    if (currentStroke != null) {
                        currentStroke.addPoint(x, y);
                        invalidate();
                    }
                    return true;

                case MotionEvent.ACTION_UP:
                case MotionEvent.ACTION_CANCEL:
                    if (currentStroke != null) {
                        strokes.add(currentStroke);
                        currentStroke = null;
                        invalidate();
                    }
                    return true;
            }
            return super.onTouchEvent(event);
        }
    }

    // ============================================================
    // Stroke — ضربة واحدة (مسار واحد)
    // ============================================================
    private static class Stroke {

        private final Paint paint;
        private final Path path;

        public Stroke(int color, float strokeWidth) {
            paint = new Paint(Paint.ANTI_ALIAS_FLAG);
            paint.setColor(color);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(strokeWidth);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setDither(true);

            path = new Path();
        }

        public void addPoint(float x, float y) {
            if (path.isEmpty()) {
                path.moveTo(x, y);
            } else {
                path.lineTo(x, y);
            }
        }

        public void draw(Canvas canvas) {
            canvas.drawPath(path, paint);
        }
    }
}