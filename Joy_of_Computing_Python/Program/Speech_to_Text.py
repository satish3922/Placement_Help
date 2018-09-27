import speech_recognition as sr
AUDIO_FILE = ('sample.wav')

r = sr.Recognizer()

with sr.AudioFile(AUDIO_FILE) as source:
	audio = r.record(source)

try : 
	print ("Text : "+ r.recognize_google(audio))
except sr.UnknownValueError :
	print ("Bad Audio")
except sr.RequestError :
	print ("Server Failed")
 
