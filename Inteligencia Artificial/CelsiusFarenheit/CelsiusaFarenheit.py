import tensorflow as tf
import numpy as np
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense

# Datos de entrenamiento
celsius = np.array([-40, -10, 0, 8, 15, 22, 38], dtype=float)
fahrenheit = np.array([-40, 14, 32, 46, 59, 72, 100], dtype=float)

# Crear el modelo de la red neuronal
model = Sequential()
model.add(Dense(1, input_shape=[1]))

# Compilar el modelo
model.compile(loss='mean_squared_error', optimizer='adam')

# Entrenar la red neuronal
model.fit(celsius, fahrenheit, epochs=50000, verbose=0)

# Realizar una predicción
celsius_val = 40
fahrenheit_val = model.predict([celsius_val])
print(fahrenheit_val)